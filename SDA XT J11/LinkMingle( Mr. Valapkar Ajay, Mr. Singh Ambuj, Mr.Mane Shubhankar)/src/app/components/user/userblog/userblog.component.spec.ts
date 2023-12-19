import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserblogComponent } from './userblog.component';

describe('UserblogComponent', () => {
  let component: UserblogComponent;
  let fixture: ComponentFixture<UserblogComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UserblogComponent]
    });
    fixture = TestBed.createComponent(UserblogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});