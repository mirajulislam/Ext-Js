
Ext.define('ThemeExt.view.main.MainController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.main',

	   onRegistration: function(/*sender,record*/) {
    const thisInstance = this;
    var newjopbId = Ext.getCmp('jobId').getValue();
    var newjopbTitle = Ext.getCmp('title').getValue();
    var newjopbType = Ext.getCmp('type').getValue();
    var newjopbCategory = Ext.getCmp('category').getValue();
    var newjopbLocation = Ext.getCmp('location').getValue();
       var Job = {
            jobId: newjopbId,
            title: newjopbTitle,
            type: newjopbType,
            category: newjopbCategory,
            location: newjopbLocation
        };
    console.log(Job);   
    store = this.getStore('Students');
    store.insert(0, Job);
    store.sync();
		
	   
		
        Ext.Ajax.request({
            url: "jobs/add",
            method: 'POST',
        /*params:{
            ajax_req: Ext.util.JSON.encode(Job)
        },*/
        jsonData : Ext.util.JSON.encode(Job), /*Ext.create('Students.model.Student').getData(),*/
        success : function(response){
            Ext.Msg.alert('Status','Saved Successfully.');
        },
        failure : function(response){
            Ext.Msg.alert('Status','Save failed.');
        }
    });
    },
	
	    deleteData: function (grid, rowIndex, colIndex) {
        var rec = grid.getStore().getAt(rowIndex);

       // Ext.Msg.alert('Approve', rec.get('name')+" "+ rec.get('id')+" "+ rec.get('email'));
       var Id=rec.get('jobId');
       var Jobtitle=rec.get('title');
       var jobType= rec.get('type');
       var JobCategory=rec.get('category');
       var jobLocation= rec.get('location');
       var tempJob = {
        jobId: Id,
        title: Jobtitle,
        type: Jobtitle,
        category: JobCategory,
        location: jobLocation

    };
    Ext.Msg.alert("Are you Sure ? Delete : "+tempJob.jobId);
       // Ext.toast("Name : "+tempJob.sname+"<br>Email: "+tempJob.semail+"<br>Location: "+tempJob.slocks);
       Ext.Ajax.request({
        url : 'jobs/delete', 
        method:"DELETE",                                                                               
        headers: { 'Content-Type': 'application/json' },                                                                                                          
        jsonData: tempJob,
        success: function (response) {
         Ext.Msg.alert('Status','Delete Success');
         window.location.reload();
     },
     failure: function (response) {
      Ext.Msg.alert('Status','Delete Failed');
  }
});
   },
   
   
       updateData: function (grid, rowIndex, colIndex) {

        var rec = grid.getStore().getAt(rowIndex);

       // Ext.Msg.alert('Approve', rec.get('name')+" "+ rec.get('id')+" "+ rec.get('email'));
       var Id=rec.get('jobId');
       var Jobtitle=rec.get('title');
       var jobType= rec.get('type');
       var JobCategory=rec.get('category');
       var jobLocation= rec.get('location');

             var win = Ext.create('Ext.Window', {
                extend: 'Ext.window.Window',
                title: 'Student Information',
                iconCls: 'x-fa fa-update',
                layout: 'form',
                xtype: 'form',
                width: 400,
                height: 500,
                plain: true,

                items: [
                {
                    xtype: 'textfield',
                    fieldLabel: 'Job Id',
                    name: 'jobId',
                    disabled: true ,
                    value: rec.get('jobId')

                },
                {
                    xtype: 'textfield',
                    fieldLabel: 'Title',
                    name: 'title',
                    value: rec.get('title')
                },
                {
                    xtype: 'textfield',
                    fieldLabel: 'Type',
                    name: 'type',
                    value: rec.get('type')
                },
                {
                    xtype: 'textfield',
                    fieldLabel: 'Category',
                    name: 'category',
                    value: rec.get('category')                },
                    {
                        xtype: 'textfield',
                        fieldLabel: 'Location',
                        name: 'location',
                        value: rec.get('location')
                    }
                    ],
                    dockedItems: [
                    {
                        xtype: 'toolbar',
                        dock: 'bottom',
                        ui: 'footer',
                        items: [
                        {
                            xtype: 'button',
                            text: 'Cancel',
                            handler: function () {
                                win.close();
                            }
                        }, '->', {
                            xtype: 'button',
                            text: 'Update',
                                //Saving an issue starts from here
                                listeners: {
                                    click: function () {

                                     var sjobId = this.up('window').down('textfield[name=jobId]').getValue();
                                      var sTitle = this.up('window').down('textfield[name=title]').getValue();
                                      var sType = this.up('window').down('textfield[name=type]').getValue();
                                      var sCategory = this.up('window').down('textfield[name=category]').getValue();
                                      var sLocation = this.up('window').down('textfield[name=location]').getValue();
                                      var updateJob = {
                                           jobId: sjobId,
                                            title: sTitle,
                                            type: sType,
                                            category: sCategory,
                                            location: sLocation,
                                        };
                                        // Ext.toast("Name : "+tempJob.sname+"<br>Email: "+tempJob.semail+"<br>Location: "+tempJob.slocks);
                                        Ext.Ajax.request({
                                            url: "jobs/update",
                                            method: 'PUT',
                                            headers: { 'Content-Type': 'application/json' },
                                            jsonData: updateJob,
                                            success: function (response) {
                                                Ext.Msg.alert('Status','Updated Successfully.');
                                                window.location.reload();

                                            },
                                            failure: function (response) {
                                                Ext.Msg.alert('Status','Update Failed.');
                                            }
                                        });
                                        win.close();
                                    }
                                }
                            }
                            ]
                        }
                        ]
                    }).show();

}
	
});
