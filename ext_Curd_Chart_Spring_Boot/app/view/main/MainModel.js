/**
 * This class is the view model for the Main view of the application.
 */
Ext.define('App1.view.main.MainModel', {
    extend: 'Ext.app.ViewModel',

    alias: 'viewmodel.main',

    data: {
        name: 'App1',
        selectedIssue: null,
 		nameFilter: null,

    },
    stores: {
    	Jobs: {
    		model: 'App1.model.Job',
    		autoLoad: true,
 			pageSize: 0,
 			remoteSort: false,
 			remoteFilter: false,
 			autoSync: true,
   //  		data: { 
   //  			items: [
			//         { jobtype: 'Actor',    title:'film actor',categories:'A',location:'Dhaka'},
			//         { jobtype: 'Engineer', title: 'computer engineer',categories:'B',location:'Dhaka' },
			//         { jobtype: 'Doctor',   title: 'surgey doctor',categories:'C',location:'Dhaka'},
			//         { jobtype: 'Teacher',  title: 'Math tecaher',categories:'C',location:'Dhaka' }
			//     ]
			// },

		    proxy: {
		        type: 'rest',
		        url: '/jobs',
		        reader: {
		            type: 'json',
		            rootProperty: 'items'
		        },
		        writer: {
		        	writeAllFields: true
		        }
		    }
    	}
    }

    //TODO - add data, formulas and/or methods to support your view
});
