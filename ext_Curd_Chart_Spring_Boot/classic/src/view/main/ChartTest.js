Ext.define('App1.view.main.ChartTest', { 
extend: 'Ext.chart.PolarChart',
requires: ['Ext.chart.series.Pie'],
xtype: 'pichart',
width: 600,
height: 600,

bind: {
store: '{Jobs}'
},
/*store: {
fields: ['name', 'value'],*/
//fields: ['jobId', 'title','type', 'category','location'],
/*data: [
{"name": "Item-0", "value": 57},
{"name": "Item-1", "value": 45},
{"name": "Item-2", "value": 67}
]
},
*/
legend: {
docked: 'bottom'
},

series: [{
type: 'pie',
xField: 'jobId',
label: {
field: 'title'
},
donut: 30 
}]

});

// Ext.define('App1.view.main.ChartTest', {

// 	extend: 'Ext.chart.CartesianChart',
// 	requires:['Ext.chart.series.Line'],
// 	xtype: 'pichart',

// 	  width: 600,
//    height: 400,
//    insetPadding: 40,

//    // store: {
//    //     fields: ['name', 'data1', 'data2'],
//    //     data: [{
//    //         'name': 'metric one',
//    //         'data1': 10,
//    //         'data2': 14
//    //     }, {
//    //         'name': 'metric two',
//    //         'data1': 7,
//    //         'data2': 16
//    //     }, {
//    //         'name': 'metric three',
//    //         'data1': 5,
//    //         'data2': 14
//    //     }, {
//    //         'name': 'metric four',
//    //         'data1': 2,
//    //         'data2': 6
//    //     }, {
//    //         'name': 'metric five',
//    //         'data1': 27,
//    //         'data2': 36
//    //     }]
//    // }

//    bind: {
// store: '{Jobs}'
// }
//    ,
//    axes: [{
//        type: 'numeric',
//        position: 'left',
//        fields: ['data1'],
//        title: {
//            text: 'Sample Values',
//            fontSize: 15
//        },
//        grid: true,
//        minimum: 0
//    }, {
//        type: 'category',
//        position: 'bottom',
//        fields: ['name'],
//        title: {
//            text: 'Sample Values',
//            fontSize: 15
//        }
//    }],
//    series: [{
//        type: 'line',
//        style: {
//            stroke: '#30BDA7',
//            lineWidth: 2
//        },
//        xField: 'name',
//        yField: 'data1',
//        marker: {
//            type: 'path',
//            path: ['M', - 4, 0, 0, 4, 4, 0, 0, - 4, 'Z'],
//            stroke: '#30BDA7',
//            lineWidth: 2,
//            fill: 'white'
//        }
//    }, {
//        type: 'line',
//        fill: true,
//        style: {
//            fill: '#96D4C6',
//            fillOpacity: .6,
//            stroke: '#0A3F50',
//            strokeOpacity: .6,
//        },
//        xField: 'name',
//        yField: 'data2',
//        marker: {
//            type: 'circle',
//            radius: 4,
//            lineWidth: 2,
//            fill: 'white'
//        }
//    }]

// });