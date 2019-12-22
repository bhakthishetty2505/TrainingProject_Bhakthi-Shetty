import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  cart: [] = [];
  constructor(private auth: AuthService) {
    this.getcart();
  }

  ngOnInit() {
  }

  getcart() {
    this.cart = this.auth.cart();
    console.log(this.cart);

  }

}
