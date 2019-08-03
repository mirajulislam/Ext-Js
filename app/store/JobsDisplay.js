Ext.define('ThemeExt.store.JobsDisplay', {
    extend: 'Ext.data.Store',

    alias: 'store.jobsDisplay',

    fields: [
        'job_id', 'title', 'type','category','location','action'
    ],

    /*data: { items: [
        { job_id: 'Jean Luc', title: "jeanluc",   type: "555-111-1111", category: "mr.data@enterprise.com", location: "jeanluc", action: "jeanluc"},
        { job_id: 'Worf',     title: "worf",      type: "555-222-2222", category: "mr.data@enterprise.com", location: "jeanluc", action: "jeanluc"},
        { job_id: 'Deanna',   title: "deanna",    type: "555-333-3333", category: "mr.data@enterprise.com", location: "jeanluc", action: "jeanluc"},
        { job_id: 'Deanna',   title: "deanna",    type: "555-333-3333", category: "mr.data@enterprise.com", location: "jeanluc", action: "jeanluc"},
        { job_id: 'Deanna',   title: "deanna",    type: "555-333-3333", category: "mr.data@enterprise.com", location: "jeanluc", action: "jeanluc"},
        { job_id: 'Data',     title: "mr",        type: "555-444-4444", category: "mr.data@enterprise.com", location: "jeanluc", action: "jeanluc"}
    ]},

    proxy: {
        type: 'memory',
        reader: {
            type: 'json',
            rootProperty: 'items'
        }
    }*/
});
