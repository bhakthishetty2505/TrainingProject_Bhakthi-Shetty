import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  msg: string;
  error: string;
  constructor(private auth: AuthService) { }

  addProduct(addProductForm) {
    this.auth.addProduct(addProductForm.value)
      .subscribe(res => {
        console.log(res);
        addProductForm.reset();
        this.msg = JSON.stringify(res.message);
      }, err => {
        console.log(err);
        this.error = err.error.message;
      });
  }

  ngOnInit() {
  }

}
