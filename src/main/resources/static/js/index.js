function logHi() {
    console.log("Hi!");
}

function logTime() {
    $.get(
        "/time",
        function(response) {
            console.log(response);
        }
    );
}