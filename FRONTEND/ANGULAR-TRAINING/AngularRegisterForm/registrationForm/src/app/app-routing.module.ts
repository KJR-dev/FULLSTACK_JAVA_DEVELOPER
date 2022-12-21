import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { RegisterFormComponent } from './pages/register-form/register-form.component';


const routes: Routes = [
  {
    path: 'register',
    component: RegisterFormComponent,
    pathMatch: 'full'

  },
  {
    path: 'nav',
    component: NavBarComponent,
    pathMatch: 'full'

  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
