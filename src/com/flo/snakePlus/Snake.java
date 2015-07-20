package com.flo.snakePlus;

public class Snake {

//    Player owner;

    private Coordinate[] elements;
    private int length = 0;

    public Snake() {

        elements = new Coordinate[100];
        claimTile(new Coordinate(9, 9));

    }

    public void claimTile(Coordinate coord) {
        if (length == 0) {
            elements[0] = coord;
            length++;
            MainGameFrame.field.getTile(coord).changeOwner();
        } else {

        }
    }
}
//
//    public void addElement(int x, int y) { //works as intended
//        if (length != 0) {
//            for (int i = length - 1; i >= 0; --i) {
//                elements[i + 1] = elements[i];
//            }
//        }
//        elements[0] = super.getTile(x, y);
//        elements[0].switchState();
//        length++;
//    }
//
//    private void deleteLastElement() {
//        elements[length - 1].switchState();
//        elements[length - 1] = null;
//        length--;
//    }
//
//    public void moveDown() {
//        addElement(elements[0].);
//    }
//
//
//    public void move(KeyCode direction) {
////        Tile phantom = new Tile();
////        Coordinate x = new Coordinate(elements[0].location.getX(), elements[0].location.getY());
////        switch (direction) {
////            case UP:
////                addElement(elements[0].get);
////                break;
////            case RIGHT:
////                x.right();
////                break;
////            case DOWN:
////                x.down();
////                break;
////            case LEFT:
////                x.left();
////                break;
////        }
////        boolean collide = false;
////        for (int i = 1; i < length; i++) {
////            if (elements[i] == x.getX() && elements[i] == x.getY()) {
////                collide = true;
////            }
////        }
////        boolean eat = false;
////        if (super.getTile(x).isEatable()) {
////            eat = true;
////        }
////        if (collide) {
////            System.out.println("Collision!");
////        } else {
////            addElement(x);
////            if (eat) {
////                super.addSnack();
////            } else {
////                deleteLastElement();
////            }
////        }
//    }
//
//    public void setNextDirection(KeyCode input) {
//        if (!isReverseDirection(input)) {
//            nextDirection = input;
//        }
//    }
//
//    public KeyCode getNextDirection(){
//        return nextDirection;
//    }
//
//    private boolean isReverseDirection(KeyCode input) {
//        if (input == KeyCode.DOWN && lastDirection == KeyCode.UP) return true;
//        if (input == KeyCode.UP && lastDirection == KeyCode.DOWN) return true;
//        if (input == KeyCode.LEFT && lastDirection == KeyCode.RIGHT) return true;
//        if (input == KeyCode.RIGHT && lastDirection == KeyCode.LEFT) return true;
//        lastDirection = input;
//        return false;
//    }

