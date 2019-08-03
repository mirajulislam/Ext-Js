/**
 * This class is the view model for the Main view of the application.
 */
Ext.define('ThemeExt.view.main.MainModel', {
    extend: 'Ext.app.ViewModel',

    alias: 'viewmodel.main',

    data: {
        name: 'ThemeExt',
		selectedIssue: null,
 		nameFilter: null
    },
	 	stores: {
 		Students: {
 			model: 'ThemeExt.model.Student',
 			autoLoad: true,
 			pageSize: 0,
 			remoteSort: false,
 			remoteFilter: false,
 			autoSync: true,
 			proxy : {
 				type : 'rest',
 				
 				reader : {
 					type : 'json',
 					rootProperty :'jobs'
 				},
				url: 'jobs/getdata',
				
 				writer : {
 					writeAllFields : true
 				}
 			}
 		}
 	}

    //TODO - add data, formulas and/or methods to support your view
});
