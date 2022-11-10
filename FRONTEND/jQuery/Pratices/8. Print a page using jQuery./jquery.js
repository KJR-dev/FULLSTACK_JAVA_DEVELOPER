$("button").click(function () {
  window.print();
  return false;
});
function zebra() {
    $("tr:odd").addClass("zebra");
    $("tr:odd").fadeOut(500);
    $("tr:odd").fadeIn(500); 
}
setInterval(zebra,1000);