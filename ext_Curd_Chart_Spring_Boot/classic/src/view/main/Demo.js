Ext.define('App1.view.main.Demo', {
    extend: 'Ext.grid.Panel',
    xtype: 'demolist',
    id: 'listdata',
    controller: 'main',
    viewModel: 'main',

    title: 'Job',

    bind: { 
        store: '{Jobs}' 
    },
    columns: [
        { text: 'Job Id   ',  dataIndex: 'jobId',width: 220},
        { text: 'Title   ',  dataIndex: 'title',width: 220},
        { text: 'Job Type   ', dataIndex: 'jobtype' ,width: 220},
        { text: 'Categories',  dataIndex: 'categories',width: 220 },
        { text: 'Location',  dataIndex: 'location',width: 220 },


               {
        text: 'Edit Option',
        xtype: 'actioncolumn',
        menuDisabled: true,
        sortable: false,
        
        items: [{
            
            text: 'Edit',
            flex: 0.6,
            iconCls: 'x-fa fa-edit white',
            handler: 'updateData'
        }]
    },{
        text: 'Delete Option',
        xtype: 'actioncolumn',
        menuDisabled: true,
        sortable: false,

        items: [{

            text: 'Delete',
            flex: 0.6,
            iconCls: 'x-fa fa-trash white',
            handler: 'deleteData'
           /* listeners:{
                click: 'deleteData'
            }*/
        }]
    }

    ],

    listeners: {
        
        itemdblclick: 'onItemSelected' 
        //select: 'onItemSelected'
        // itemdblclick: function(dv, record, item, index, e) {
        //     //alert('working');
        //     console.log('>>',record);
        // }

    }
});