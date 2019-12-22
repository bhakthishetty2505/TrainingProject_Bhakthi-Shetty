import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  public orders;
  constructor(private http: HttpClient) { }

  updateProduct(product): Observable<any> {
    return this.http.put('http://localhost:8080/stockmanagement/updateProduct', product,
      { headers: new HttpHeaders({ 'Content-Type': 'application/json' }) });
  }

  addProduct(product): Observable<any> {
    return this.http.post('http://localhost:8080/stockmanagement/addProduct', product);
  }

  getData(name): Observable<any> {
    return this.http.get<any>('http://localhost:8080/stockmanagement/allProducts');
  }

  addcart(cart) {
    this.orders = cart;
  }

  cart() {
    return this.orders;
  }
}
