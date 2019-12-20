import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient ) {}

    updateProduct(product): Observable<any> {
      return this.http.put('http://localhost:8080/stockmanagement/updateProduct', product,
      {headers: new HttpHeaders({'Content-Type': 'application/json'}) });
    }

    addProduct(product): Observable<any> {
      return this.http.post('http://localhost:8080/stockmanagement/addProduct', product);
    }
}
