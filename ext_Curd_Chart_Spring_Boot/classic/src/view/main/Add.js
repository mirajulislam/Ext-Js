Ext.define('App1.view.main.Add', {

	extend:'Ext.form.Panel',
 	xtype: 'addUser',
 	id: 'addDemo',
    controller: 'main',
    viewModel: 'main',
 	title: 'Registration Form',
 	height: 500,
 	width: 400,
 	bodyPadding: 10,
 	defaultType: 'textfield',

 	 items:[
 	 {
 		fieldLabel: 'Job Id',
 		placeHolder:'Enter Your job id',
 		id: 'jobId',
		name:'jobId',
 		allowBlank: false,
 		flex: 1,
 		disabled: true 
 
 	},
 	 {
                    xtype: 'textfield',
                    fieldLabel: 'Title',
                    name: 'title',
                    id:'title',
                    labelAlign:'top',
                    cls:'field-margin',
                    flex:1     
                },{
                    xtype: 'textfield',
                    fieldLabel: 'Job Type',
                    name: 'jobtype',
                    id:'jobtype',
                    labelAlign:'top',
                    cls:'field-margin',
                    flex:1
                    
                },

            {
                xtype: 'textfield',
                fieldLabel: 'Categories',
                name: 'categories',
                id:'categories',
                labelAlign:'top',
                cls:'field-margin',
                flex:1
            }, {
                xtype: 'textfield',
                fieldLabel: 'Location',
                name: 'location',
                id:'location',
                labelAlign:'top',
                cls:'field-margin',
                flex:1
            }],

              buttons: [{
                text   : 'Save',
                handler: 'onSave'
            },{
                text   : 'Reset',
                handler: ''
            }]

});