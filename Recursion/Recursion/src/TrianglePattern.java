class TrianglePattern {
    public void Print(int rows){
        Rows(rows, rows);
    }
    public void Rows(int rows, int columns){
        if(rows == 0)
            return;
        columns(columns);
        System.out.println();
        Rows(rows -1 , columns);
    }
    public void columns(int columns){
        if(columns == 0)
            return;
        System.out.print("*");
        columns(columns-1);
    }
}
