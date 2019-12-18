import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error: string;
  msg: string;
  constructor(private auth: AuthService, private router: Router) { }

  login(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.loginUser(form.value).subscribe(data => {
      console.log('Response of Login', data);
      if (data && data.role === 'admin' && data.message === 'Login Successfull') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl('/admin');
      } else if (data && data.role === 'manager' && data.message === 'Login Successfull') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl('/manager');
      } else if (data && data.role === 'user' && data.message === 'Login Successfull') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl('/user');
      } else {
        this.msg = JSON.stringify(data.message);
      }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}
