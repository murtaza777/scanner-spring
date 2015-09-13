$(document).ready(function() {
    var studentPosition = 0;
    $("#addStudentButton").click(function() {
        studentPosition++;

        $.get("<%=request.getContextPath()%>/appendStudentView.page", { fieldId: studentPosition},
            function(data){
                $("#submitRow").before(data);
            });
    });
});

$(document).ready(function(){
    $('.box').hide();
    $('#dropdown').change(function() {
        $('.box').hide();
        $('.' + $(this).val()).show();
    }).trigger('change');
});