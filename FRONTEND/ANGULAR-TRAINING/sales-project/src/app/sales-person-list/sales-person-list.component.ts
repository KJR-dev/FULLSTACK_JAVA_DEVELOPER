import { Component, OnInit } from '@angular/core';
import { SalesPerson } from './sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})

export class SalesPersonListComponent implements OnInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  // create an array of objects
  salesPersonList: SalesPerson[] = [
    new SalesPerson("Anup","kumar","anup.kumar@luv2code.com",5000),
    new SalesPerson("john","Doe","jhon.doe@luv2code.com",6000),
    new SalesPerson("Claire","Murphy","Claire.Murphy@luv2code.com",7000),
    new SalesPerson("Mai","Truong","Mai.Truong@luv2code.com",8000)
  ]
}
