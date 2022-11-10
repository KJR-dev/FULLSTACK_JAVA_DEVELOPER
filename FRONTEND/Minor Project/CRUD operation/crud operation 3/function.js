let users =" ";
bindData();
function bindData() {
    for (let index = 0; index < data.length; index++) {
       users+=
       "<tr><td>"+  data[index].fname+
        "</td><td>"+data[index].lname+
        "</td><td>"+data[index].rno+
        "</td><td>"+data[index].email+
        "</td><td>"+data[index].mob+
        "</td><td>"+data[index].address+
        "</td></tr>";
    }
    document.getElementById("datasections").innerHTML=users;
}