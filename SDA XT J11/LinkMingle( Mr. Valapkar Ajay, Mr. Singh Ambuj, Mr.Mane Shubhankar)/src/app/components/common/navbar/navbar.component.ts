import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthserviceService } from 'src/app/core/auth/authservice.service';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  user: User | null;

  constructor(private authService: AuthserviceService, private router: Router) {
    this.user = this.authService.getUser();
    console.log(this.user?.firstname);
  }
  checkLogin() {
    if (this.user && this.user.email) {
      this.router.navigate(['/dashboard/blogprofile'])
    } else {
      this.router.navigate(['/login'])
    }
  }
}
