// Call the dataTables jQuery plugin
$(document).ready(function() {

    cargarUsuarios();
    //cargarUsuarios();
  $('#usuarios').DataTable();
});


async function cargarUsuarios(){

        const request = await fetch('usuarios', {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        });
        const usuarios = await request.json();

        console.log(usuarios);

        let listadoHtml = '';
       for (let usuario  of usuarios){
           let formatoUsuario = ' <tr><td>'+usuario.id+'</td><td> '+usuario.nombre+' '+usuario.apellido+'<td>'+usuario.email+'</td><td>'+usuario.telefono+'</td><td>\n' +
               '                                                <a href="#" class="btn btn-danger btn-circle btn-sm">\n' +
               '                                                    <i class="fas fa-trash"></i>\n' +
               '                                                </a>\n' +
               '                                            </td></tr> ' ;

           listadoHtml += formatoUsuario;
       }
    document.querySelector('#usuarios tbody').innerHTML = listadoHtml;
}

