package org.example.course_work;

import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageeTableCell extends TableCell<Horseinfo, Image> {

    private final ImageView imageView;

    public ImageeTableCell() {
        imageView = new ImageView();
        imageView.setFitWidth(80);
        imageView.setFitHeight(80);
        setGraphic(imageView);
    }

    @Override
    protected void updateItem(Image item, boolean empty) {
        super.updateItem(item, empty);
        if (empty || item == null) {
            imageView.setImage(null);
        } else {
            imageView.setImage(item);
        }
    }
}