/**
 * This view is an example list of people.
 */
 Ext.define('ThemeExt.view.main.Display', {
    extend: 'Ext.grid.Panel',
    xtype: 'display',
    id: 'listdata',
    controller: 'main',
    viewModel: 'main',


    title: 'Jobs Display',

    bind : {
        store: '{Students}'
       
    },

    columns: [
    { text: 'Job Id',  dataIndex: 'jobId' },
    { text: 'Title', dataIndex: 'title' ,flex: 0.3 },
    { text: 'Type', dataIndex: 'type' ,flex: 0.3 },
    { text: 'Category',  dataIndex: 'category', flex: 0.3 },
    { text: 'Location',  dataIndex: 'location', flex: 0.3 },
    /*{ text: 'Action', dataIndex: 'action', flex: 0.3, },*/{
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
	 }
    /*listeners: {
        select: 'onItemSelected'
    }*/
});
