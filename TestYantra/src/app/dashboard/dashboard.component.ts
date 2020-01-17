import { Component, OnInit } from '@angular/core';
import * as Highcharts from 'highcharts';

import { NgZone } from "@angular/core";
import * as am4core from "@amcharts/amcharts4/core";
import * as am4charts from "@amcharts/amcharts4/charts";
import am4themes_animated from "@amcharts/amcharts4/themes/animated";

am4core.useTheme(am4themes_animated);


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
 
  private chart: am4charts.XYChart;
  dataSource: Object;
  constructor() { 
    this.dataSource = {
      chart: {
        caption: "Company Profit Indicator",
        subcaption: "2019",
        lowerlimit: "0",
        upperlimit: "100",
        showvalue: "1",
        theme: "fusion"
    },

    colorrange: {
        color: [{
                minvalue: "0",
                maxvalue: "25",
                code: "#BB5D52 "
            },
            {
                minvalue: "25",
                maxvalue: "60",
                code: "#FFC533"
            },
            {
                minvalue: "60",
                maxvalue: "100",
                code: "#62B58F"
            }
        ]
    },
    dials: {
        dial: [{
            value: "65",
            tooltext: "<b>9%</b> lesser that target"
        }]
    },
    trendpoints: {
        point: [{
            startvalue: "80",
            displayvalue: "Target",
            thickness: "2",
            color: "#E15A26",
            usemarker: "1",
            markerbordercolor: "#E15A26",
            markertooltext: "80%"
        }]
    }
    }
   }
 
   highcharts = Highcharts;

   // c1
   cart11 = {
    chart: {
        plotBackgroundColor: null,
        plotBorderWidth: null,
        plotShadow: false,
        type: 'pie'
      },
      title: {
        text: 'Technology Wise Billable Engineers',
        x:+20
      },
      tooltip: {
        pointFormat: '<b>{point.y}</b>'
      },
      plotOptions: {
        pie: {
          allowPointSelect: true,
          cursor: 'pointer',
          dataLabels: {
            enabled: false
          },
          showInLegend: true
        }
      },
      series: [{
       
        colorByPoint: true,
        height:'200px',
        width:'300px',
        innerSize: '20%',
        data: [{
          name: 'Java FullStack',
          y: 25,
          events: {
            click: function () {
                window.location.href = "/table"
  
            }
        }
        }, {
          name: 'MEAN Stack',
          y: 15,
          events: {
            click: function () {
                window.location.href = "/table"
  
            }
        }
        }, {
          name: 'Dot Net',
          y: 20,
          events: {
            click: function () {
                window.location.href = "/table"
  
            }
        }
        }, {
          name: 'Data Science',
          y: 30,
          events: {
            click: function () {
                window.location.href = "/table"
  
            }
        }
        }]
      }]
};

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

//chart3
cart3 = {
chart: {
  plotBackgroundColor: null,
  plotBorderWidth: 0,
  plotShadow: false
},
title: {
  text: 'Experience Wise  Billable Engineers',
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
    // ['0 Years', 35 ],
    // ['0-1 Years', 35],
    // ['1-2 Years', 40],
    // ['2-3 Years', 55],
    // ['>3 Years', 60],
    
  ]
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


ngAfterContentInit() {
  am4core.useTheme(am4themes_animated);
// Themes end

// Create chart instance
var chart = am4core.create("chartdiv1", am4charts.XYChart);

// Add data
chart.data = [{
  "year": "2011",
  "value": 600000
}, {
  "year": "2012",
  "value": 900000
}, {
  "year": "2013",
  "value": 180000
}, {
  "year": "2014",
  "value": 600000
}, {
  "year": "2015",
  "value": 350000
}, {
  "year": "2016",
  "value": 600000
}, {
  "year": "2017",
  "value": 670000
}];

// Populate data
for (var i = 0; i < (chart.data.length - 1); i++) {
  chart.data[i].valueNext = chart.data[i + 1].value;
}

// Create axes
var categoryAxis = chart.xAxes.push(new am4charts.CategoryAxis());
categoryAxis.dataFields.category = "year";
categoryAxis.renderer.grid.template.location = 0;
categoryAxis.renderer.minGridDistance = 30;

var valueAxis = chart.yAxes.push(new am4charts.ValueAxis());
valueAxis.min = 0;

// Create series
var series = chart.series.push(new am4charts.ColumnSeries());
series.dataFields.valueY = "value";
series.dataFields.categoryX = "year";

// Add series for showing variance arrows
var series2 = chart.series.push(new am4charts.ColumnSeries());
series2.dataFields.valueY = "valueNext";
series2.dataFields.openValueY = "value";
series2.dataFields.categoryX = "year";
series2.columns.template.width = 1;
series2.fill = am4core.color("#555");
series2.stroke = am4core.color("#555");

// Add a triangle for arrow tip
var arrow = series2.bullets.push(new am4core.Triangle);
arrow.width = 10;
arrow.height = 10;
arrow.horizontalCenter = "middle";
arrow.verticalCenter = "top";
arrow.dy = -1;

// Set up a rotation adapter which would rotate the triangle if its a negative change
arrow.adapter.add("rotation", function (rotation, target) {
  return getVariancePercent(target.dataItem) < 0 ? 180 : rotation;
});

// Set up a rotation adapter which adjusts Y position
arrow.adapter.add("dy", function (dy, target) {
  return getVariancePercent(target.dataItem) < 0 ? 1 : dy;
});

// Add a label
var label = series2.bullets.push(new am4core.Label);
label.padding(10, 10, 10, 10);
label.text = "";
label.fill = am4core.color("#0c0");
label.strokeWidth = 0;
label.horizontalCenter = "middle";
label.verticalCenter = "bottom";
label.fontWeight = "bolder";

// Adapter for label text which calculates change in percent
label.adapter.add("textOutput", function (text, target) {
  var percent = getVariancePercent(target.dataItem);
  return percent ? percent + "%" : text;
});

// Adapter which shifts the label if it's below the variance column
label.adapter.add("verticalCenter", function (center, target) {
  return getVariancePercent(target.dataItem) < 0 ? "top" : center;
});

// Adapter which changes color of label to red
label.adapter.add("fill", function (fill, target) {
  return getVariancePercent(target.dataItem) < 0 ? am4core.color("#c00") : fill;
});

function getVariancePercent(dataItem) {
  if (dataItem) {
    var value = dataItem.valueY;
    var openValue = dataItem.openValueY;
    var change = value - openValue;
    return Math.round(change / openValue * 100);
  }
  return 0;
}
}

ngAfterViewInit() {
 
  am4core.useTheme(am4themes_animated);
  // Themes end

  // Create chart instance
  var chart = am4core.create("profit", am4charts.RadarChart);
  
  // Add data
  chart.data = [{
    "category": "Profit",
    "value": 40,
    "full": 100
  }, {
    "category": "Cost",
    "value": 20,
    "full": 100
  }, {
    "category": "Revenue",
    "value": 60,
    "full": 100
  }];
  
  // Make chart not full circle
  chart.startAngle = -90;
  chart.endAngle = 180;
  chart.innerRadius = am4core.percent(20);
  
  // Set number format
  chart.numberFormatter.numberFormat = "#.#'%'";
  
  // Create axes
  var categoryAxis = chart.yAxes.push(new am4charts.CategoryAxis()as any);
  categoryAxis.dataFields.category = "category";
  categoryAxis.renderer.grid.template.location = 0;
  categoryAxis.renderer.grid.template.strokeOpacity = 0;
  categoryAxis.renderer.labels.template.horizontalCenter = "right";
  categoryAxis.renderer.labels.template.fontWeight = 500;
  categoryAxis.renderer.labels.template.adapter.add("fill", function(fill, target) {
    return (target.dataItem.index >= 0) ? chart.colors.getIndex(target.dataItem.index) : fill;
  });
  categoryAxis.renderer.minGridDistance = 10;
  
  var valueAxis = chart.xAxes.push(new am4charts.ValueAxis() as any);
  valueAxis.renderer.grid.template.strokeOpacity = 0;
  valueAxis.min = 0;
  valueAxis.max = 100;
  valueAxis.strictMinMax = true;
  
  // Create series
  var series1 = chart.series.push(new am4charts.RadarColumnSeries());
  series1.dataFields.valueX = "full";
  series1.dataFields.categoryY = "category";
  series1.clustered = false;
  series1.columns.template.fill = new am4core.InterfaceColorSet().getFor("alternativeBackground");
  series1.columns.template.fillOpacity = 0.08;
  // series1.columns.template.cornerRadiusTopLeft = 20;
  series1.columns.template.strokeWidth = 0;
  series1.columns.template.radarColumn.cornerRadius = 20;
  
  var series2 = chart.series.push(new am4charts.RadarColumnSeries());
  series2.dataFields.valueX = "value";
  series2.dataFields.categoryY = "category";
  series2.clustered = false;
  series2.columns.template.strokeWidth = 0;
  series2.columns.template.tooltipText = "{category}: [bold]{value}[/]";
  series2.columns.template.radarColumn.cornerRadius = 20;
  
  series2.columns.template.adapter.add("fill", function(fill, target) {
    return chart.colors.getIndex(target.dataItem.index);
  });
  
  // Add cursor
  chart.cursor = new am4charts.RadarCursor();
}


  ngOnInit() {
    
  }

}
