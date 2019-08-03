 /**
 * This view is an example list of people.
 */
 Ext.define('ThemeExt.view.main.Registration', {
 	extend:'Ext.form.Panel',
 	xtype: 'registration',
    controller: 'main',
    viewModel: 'main',
 	title: 'Registration Form',
 	height: 500,
 	width: 400,
 	bodyPadding: 10,
 	defaultType: 'textfield',
 	items: [
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
 		fieldLabel: 'Title',
 		placeHolder:'Enter Your Title Here',
 		id: 'title',
		name:'title',
 		allowBlank: false,
 		flex: 1
 		/*name: 'title'*/
 	},
 	{
 		fieldLabel: 'Type',
 		placeHolder:'Enter Your Type Here',
		name:'type',
		id:'type',
 		allowBlank: false,
 		flex: 1,
 		id: 'type'
 	},
 	{
 		fieldLabel: 'Category',
 		placeHolder:'Enter Category Here',
 		allowBlank: false,
		name:'category',
		id:'category',
 		flex: 1,
 		id: 'category'
 	},
 	{
 		fieldLabel: 'Location',
 		placeHolder:'Enter Your Location Here',
		name:'location',
		id:'location',
 		allowBlank: false,
 		flex: 1,
 		id: 'location'
 	},{
 		xtype: 'toolbar',
 		docked: 'bottom',
 		items: ['->', {
 			xtype: 'button',
 			text: 'Registration',
 			id: 'RegistrationButton',
 			flex: 1,
 			iconCls: 'x-fa fa-check',
 			//Saving an issu starts from here
 			listeners:{
 				click: 'onRegistration'
 			}

 			/*handler: function() {
 				this.up('formpanel').destroy();
 			}*/
 		}, {
 			xtype: 'button',
 			text: 'Cancel',
 			id: 'CancelButton',
 			flex: 1,
 			iconCls: 'x-fa fa-close',
 			
 			/*handler: function() {
 				this.up('formpanel').destroy();
 			}*/
 		}
 		]
 	}
 	]
 });