// Call the dataTables jQuery plugin
$(document).ready(function() {

    cargarUsuarios();
    //cargarUsuarios();
  $('#usuarios').DataTable();
});


async function cargarUsuarios(){

        const request = await fetch('usuario/3', {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        });
        const usuarios = await request.json();

        console.log(usuarios);

}

