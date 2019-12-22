import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  msg: string;
  error: string;
  product1: any;
  Product: [] = [];
  constructor(private auth: AuthService) { }

  ngOnInit() {
  }

  searchByName(searchByNameForm: NgForm) {
    this.product1 = searchByNameForm.value.name;
    console.log(this.product1);
    this.auth.getData(this.product1).subscribe(data => {
      this.Product = data.bean;
      this.msg = JSON.stringify(data.message);
    }, err => {
      console.log(err);
      this.error = err.error.message;
    }, () => {
      console.log('data acquired successfully');
    });

  }
}
