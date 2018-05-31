package Hash;

class DeletedSet extends HashSet {
    private static DeletedSet entry = null;
    private DeletedSet() {
        super(-1, -1);
    }
    static DeletedSet getDeletedSet(){
        if (entry == null) {
            entry = new DeletedSet();
        }
        return entry;
    }
}
