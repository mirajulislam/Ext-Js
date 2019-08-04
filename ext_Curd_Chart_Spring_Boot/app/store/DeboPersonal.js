Ext.define('App1.store.DeboPersonnel', {
    extend: 'Ext.data.Store',

    alias: 'store.jobpersonnel',
    storeId: 'jobpersonnel',

    model: 'App1.model.JobPersonnel',

    data: { items: [
        { id: 101, jobtype: 'Actor',    title:'film actor',categories:'A',location:'Dhaka'},
        { id: 102, jobtype: 'Engineer', title: 'computer engineer',categories:'B',location:'Dhaka' },
        { id: 103, jobtype: 'Doctor',   title: 'surgey doctor',categories:'C',location:'Dhaka'},
        { id: 104, jobtype: 'Teacher',  title: 'Math tecaher',categories:'C',location:'Dhaka' }
    ]},

    proxy: {
        type: 'memory',
        reader: {
            type: 'json',
            rootProperty: 'items'
        }
    }
});