import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  error: string;
  list;
  constructor(private http: HttpClient, private auth: AuthService) {
    http.get<any>('http://localhost:8080/stockmanagement/getAllProducts').subscribe( response => {
      console.log(response);
      this.list = response.getAllProducts();
    }, err => {
      console.log(err);
    });
  }

  update(updateForm: NgForm) {
    this.error = null;
    this.auth.updateProduct(updateForm.value).subscribe(res => {
      console.log(res);
      updateForm.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }
  ngOnInit() {
  }

}
