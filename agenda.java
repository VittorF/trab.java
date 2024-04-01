public class agenda {
    public static void main(String[] args) {
        SistemaAgenda agenda = new SistemaAgenda();

        agenda.adicionarContato(new Contato("jaiminho", "123456789"));
        agenda.adicionarContato(new Contato("Cleriton Sávio", "987654321"));
        agenda.adicionarContato(new Contato("Glédson", "456123789"));

        agenda.buscarContato("jaiminho");
        agenda.buscarContato("jorge e mateus");
        agenda.buscarContato("Glédson");

        agenda.removerContato("Cleriton Sávio");

        agenda.buscarContato("Cleriton Sávio");
    }
}
