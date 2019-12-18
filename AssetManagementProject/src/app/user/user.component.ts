import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  selectedCar;

  cars = [
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      name: 'BUGATI',
      description: 'Car'
    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
      name: 'FERRARI',
      description: 'Car'
    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
      name: 'BENZ',
      description: 'Car'
    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2016/12/07/21/50/audi-1890494__340.jpg',
      name: 'AUDI',
      description: 'Car'
    },

  ];
  constructor() { }

  ngOnInit() {
  }

  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }

}
