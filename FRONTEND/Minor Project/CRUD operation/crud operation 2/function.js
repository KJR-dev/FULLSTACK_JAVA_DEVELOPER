let data = "";
      bindData();
      function bindData() {
        for (let index = 0; index < users.length; index++) {
          data +=
            "<tr><td>" +
            users[index].id +
            "</td><td>" +
            users[index].name +
            "</td><td>" +
            users[index].email +
            "</td></tr>";
        }
        document.getElementById("datasections").innerHTML = data;
      }