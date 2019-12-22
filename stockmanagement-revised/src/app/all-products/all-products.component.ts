import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-all-products',
  templateUrl: './all-products.component.html',
  styleUrls: ['./all-products.component.css']
})
export class AllProductsComponent implements OnInit {
  public data;
  public cart;
  msg: string;
  error: string;
  list;
  constructor(private http: HttpClient, private auth: AuthService) {
    http.get<any>('http://localhost:8080/stockmanagement/allProducts').subscribe(response => {
      this.list = response.getAllProducts;
      console.log(response);
    }, err => {
      console.log(err);
    });
   }

   addToCart(i) {
    this.cart = this.data[i];
    this.auth.addcart(this.cart);
   }
  ngOnInit() {
  }

}
