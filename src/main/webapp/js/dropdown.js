$(document).ready(function () {
    //var fieldPosition = 0;
    $("#dropdown").change(function () {
      //fieldPosition++;
      var select = $("#dropdown").val();
      $("#requestForm").remove()
      if (select != 'blank') {
            $.get("./" + select,
                function (data) {
                    $("#selection").after(data);
                });
        }
    });
});