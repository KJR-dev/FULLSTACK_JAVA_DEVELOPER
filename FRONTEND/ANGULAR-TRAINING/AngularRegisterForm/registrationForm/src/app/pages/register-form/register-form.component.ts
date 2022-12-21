import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})


export class RegisterFormComponent implements OnInit {

  constructor() { }

  public user={
    userName: '',
    password: '',
    firstName: '', 
    lastName: '',
    email: '',
    phone:''
  }

  ngOnInit(): void {
  }
  formSubmit(){
    console.log(this.user);
  }
}
