import { Component, OnInit } from '@angular/core';
import * as Highcharts from 'highcharts';
@Component({
  selector: 'app-nonbilldash',
  templateUrl: './nonbilldash.component.html',
  styleUrls: ['./nonbilldash.component.css']
})
export class NonbilldashComponent implements OnInit {

  constructor() { }
  highcharts = Highcharts;
  //chart2
cart1 = {
  chart: {
    type: 'pie'
},
title: {
    text: 'Technology Wise Non Billable Engineers',
    x:+20
},
tooltip: {
    headerFormat: '',
    pointFormat: '<span style="color:{point.color}">\u25CF</span> <b> {point.name}</b><br/>' +
        ' <b>{point.y}</b><br/>' 
     
},
series: [{
    minPointSize: 10,
    height:'200px',
    width:'300px',
    innerSize: '20%',
    name: 'countries',
    data: [{
        name: 'Java FullStack',
        y: 500,
        events: {
            click: function () {
                window.location.href = "/table"
  
            }
        }
    }, {
        name: 'MEAN Stack',
        y: 420,
        events: {
            click: function () {
                window.location.href = "/table"
  
            }
        }
    }, {
        name: 'Dot net',
        y: 300,
        events: {
            click: function () {
                window.location.href = "/table"
  
            }
        }
    }, {
        name: 'Data Science',
        y: 250,
        events: {
            click: function () {
                window.location.href = "/table"
  
            }
        }
    }]
}]
};

//chart4
cart7 = {
  chart: {
    plotBackgroundColor: null,
    plotBorderWidth: 0,
    plotShadow: false
  },
  title: {
    text: 'Experience Wise Non Billable Engineers',
    x:+15
  },
  tooltip: {
    pointFormat: '{series.data.year} {point.year}: {series.name}: <b>{point.y:.0f}</b>'
  },
  plotOptions: {
    pie: {
      dataLabels: {
        enabled: true,
        format: '<b>{point.year}</b> ({point.y:,.0f}) ',
        // distance: -50,
        style: {
          fontWeight: 'bold',
          color: 'black'
        }
      },
      startAngle: -90,
      endAngle: 90,
      center: ['50%', '75%'],
      size: '150%'
    }
  },
  series: [{
    type: 'pie',
    name: 'Number of Employees',
    innerSize: '50%',
    data: [
      
      {
        year:'0 Years', y : 20,
        events : { click:function(){
          window.location.href = "/table"
        }
      }
      },
      {
        year:'0-1 Years', y : 20,
        events : { click:function(){
          window.location.href = "/table"
        }
      }
      },
      {
        year:'1-2 Years', y : 20,
        events : { click:function(){
          window.location.href = "/table"
        }
      }
      },
      {
        year:'2-3 Years', y : 20,
        events : { click:function(){
          window.location.href = "/table"
        }
      }
      },
      {
        year:'>3 Years', y : 20,
        events : { click:function(){
          window.location.href = "/table"
        }
      }
      }
      // ['0 Years', 20],
      // ['0-1 Years', 35],
      // ['1-2 Years', 40],
      // ['2-3 Years', 55],
      // ['>3 Years', 60],
      
    ]
  }]
};
  ngOnInit() {
  }

}
