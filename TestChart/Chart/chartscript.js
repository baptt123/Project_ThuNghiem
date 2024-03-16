//create chart variable and assign object canvas
const chart=document.getElementById('myChart');
//jsondata variable to get response

let JSONdata;
//myChart variable to assign new Chart object to set up chart
let myChart;
//fetch API to use get data from file data.json and return response and after that you can assign for JSONdata variable
fetch("data.json").then(function(response){
    if(response.status=== 200){
        return response.json()
    }
}).then(function(data){
    JSONdata=data;
    createChart(JSONdata, 'bar');
})
//this function is used for creating Chart
function createChart(data,type){
    let myChart=new Chart(chart,{
        type: type,
        data: {

            // Creating an array from the `name` from the json data
            // using the `map` method and assign it to the labels
            // property.
            labels: data.map(row => row.name),

            datasets: [{
                //note for information of each bar
                label: 'Test',

                // Creating an array from the `height` from the json data
                // using the `map` method and assign it to the data
                // property.
                data: data.map(row => parseFloat(row.height)),
                // width property of each bar
                borderWidth: 2
            }]
        },
        options: {
            scales: {
                y: {
                    //scale at begin position
                    beginAtZero: true
                }
            },
            // Making the chart responsive.
            responsive: true,
            maintainAspectRatio: false,
        }
    });
}