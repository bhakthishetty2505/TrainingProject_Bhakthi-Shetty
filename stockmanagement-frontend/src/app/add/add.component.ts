import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  error: string;
  constructor(private auth: AuthService) { }

  addProduct(addProductsForm: NgForm) {
    this.error = null;
    this.auth.addProduct(addProductsForm.value).subscribe( response => {
      console.log(response);
      addProductsForm.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}
