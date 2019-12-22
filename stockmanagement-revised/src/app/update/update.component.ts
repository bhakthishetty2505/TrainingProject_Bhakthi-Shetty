import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  msg: string;
  error: string;
  constructor(private auth: AuthService) { }

  ngOnInit() {
  }

  update(updateProductForm) {
    this.auth.updateProduct(updateProductForm.value)
      .subscribe(res => {
        console.log(res);
        updateProductForm.reset();
        this.msg = JSON.stringify(res.message);
      }, err => {
        console.log(err);
        this.error = err.error.message;
      });
  }

}
