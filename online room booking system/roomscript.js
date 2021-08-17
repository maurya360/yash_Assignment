function submit() {
    var From_date = document.getElementById('date').value;
    var To_date = document.getElementById('todate').value;
    var purpose = document.getElementById('Purpose').value;
    var num_people = document.getElementById('np').value;
    var emp_id = document.getElementById('eid').value;
    var phone_num = document.getElementById('n').value;
    var room_name = document.getElementById('rn').value;
    var duration = document.getElementById('time').value;
    console.log(From_date + ' ' + To_date + ' ' + purpose + ' ' + num_people + ' ' + emp_id + ' ' + phone_num + ' ' + room_name + ' ' + duration);
    if (!From_date || !To_date || !purpose) {
        alert("please fill all the boxes");
        return;
    }

    var display = document.getElementById("display");
    var newRow = display.insertRow(display.length);
    var cell1 = newRow.insertCell(0);
    var cell2 = newRow.insertCell(1);
    var cell3 = newRow.insertCell(2);

    cell1.innerHTML = From_date;
    cell2.innerHTML = To_date;
    cell3.innerHTML = purpose;
    row++;

}