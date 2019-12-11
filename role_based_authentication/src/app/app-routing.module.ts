import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UserComponent } from './user/user.component';
import { AuthguardService } from './authguard.service';


const routes: Routes = [
  {path : '' , component : HomeComponent},
  {path : 'login', component : LoginComponent },
  {
    path : 'admin' , component : AdminComponent,
    canActivate: [AuthguardService], data : {roles: ['admin']}
  },
  {path : 'home' , component : HomeComponent },
  {path : 'register' , component : RegisterComponent },
  {
    path : 'user' , component : UserComponent,
    canActivate: [AuthguardService], data : {roles: ['admin', 'user']}
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
