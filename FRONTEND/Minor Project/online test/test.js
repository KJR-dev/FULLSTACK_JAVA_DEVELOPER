function question_bind() {
  let str = "";
  fetch("./Question.json")
    .then(function (response) {
      return response.json();
    })
    .then(function (data) {
      for (var i = 0; i < data.length; i++) {
        //console.log(data[i]);

        str += "<h1>Q." + (i + 1) + " " + data[i].QUESTION + "</h1>";
      }
      document.getElementById("t1").innerhtml = str;
      console.log(str);
    });
}
