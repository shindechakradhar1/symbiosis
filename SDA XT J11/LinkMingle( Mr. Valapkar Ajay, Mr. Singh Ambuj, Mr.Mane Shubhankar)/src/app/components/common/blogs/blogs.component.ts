import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { catchError, throwError } from 'rxjs';
import { AuthserviceService } from 'src/app/core/auth/authservice.service';
import { BlogserviceService } from 'src/app/core/blog/blogservice.service';
import { Category } from 'src/app/models/category';
import { Post } from 'src/app/models/post';
import { User } from 'src/app/models/user';
import { Comment } from 'src/app/models/comment';
@Component({
  selector: 'app-blogs',
  templateUrl: './blogs.component.html',
  styleUrls: ['./blogs.component.css']
})
export class BlogsComponent implements OnInit {
  posts: Post[] = [];
  comments: Comment[] = [];
  numBlog = 3;
  displayedPosts: Post[] = [];
  selectedCategoryId: number = 0;
  user: User | null | undefined;
  blog: Post = {
    title: '',
    content: '',
    category: new Category,
    blogId: 0,
    categoryid: 0
  }
  comment: Comment = {
    content: ''
  }
  constructor(private blogsservice: BlogserviceService, private authservice: AuthserviceService, private router: Router, private http: HttpClient) { }

  ngOnInit(): void {
    this.blogsservice.getAllBlog().subscribe(data => {
      this.posts = data;
      this.displayedPosts = this.posts.slice(0, this.numBlog);

    });
  }

  loadBlogs() {
    console.log("button working")
    this.numBlog += 1;
    console.log(this.numBlog)
    this.displayedPosts = this.posts.slice(0, this.numBlog);
  }
  loadBlogsCategory(categoryId: number) {
    console.log(categoryId)
    this.blogsservice.getPostByCategory(categoryId).subscribe(data => {
      console.log(categoryId)
      console.log("This working categiry ")
      this.posts = data;
      console.log(this.posts)
      this.displayedPosts = this.posts;

    });
  }
  onCategorySelect(categoryId: number) {
    this.loadBlogsCategory(categoryId);
  }
  postComment(postId: number) {
    console.log(postId)
    this.user = this.authservice.getUser();
    if (this.user && this.user.email) {
      this.blogsservice.getUserByEmail(this.user.email).subscribe({
        next: user => {
          this.user = user

          let postData = {
            "content": this.comment.content
          }
          const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
          const userId = user.userId

          this.http.post('http://localhost:8080/blog/user/' + userId + '/post/' + postId, postData, { headers: headers }).pipe(
            catchError(error => {
              console.log(postData);
              console.error("Post Upload Failed:", error);
              return throwError(() => new Error('Registration failed'));
            })
          )
            .subscribe(
              (resultData: any) => {
                console.log(resultData);
              }
            );
        }
      })
    }
  }


}
