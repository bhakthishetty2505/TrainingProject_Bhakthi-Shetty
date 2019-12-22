import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { SearchComponent } from './search/search.component';
import { UpdateComponent } from './update/update.component';
import { AllProductsComponent } from './all-products/all-products.component';
import { CartComponent } from './cart/cart.component';


const routes: Routes = [
  {path : 'search', component : SearchComponent},
  {path : 'add', component : AddComponent},
  {path: 'update', component: UpdateComponent},
  {path: 'allProducts', component: AllProductsComponent},
  {path: 'cart', component: CartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
