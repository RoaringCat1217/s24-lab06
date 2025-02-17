package drawing.shapes;

import drawing.writing.JPEGWriter;
import drawing.writing.PNGWriter;

import java.io.IOException;
import java.io.Writer;

/**
 * Refactor Task 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public interface Shape {

    /**
     * Converts shape into lines.
     *
     * @return lines of this shape.
     */
    Line[] toLines();

    /**
     * Draws lines to file.
     */
    default void draw(Writer writer) {
        try {
            Line[] lines = this.toLines();
            for (Line line : lines) {
                if (writer instanceof JPEGWriter) {
                    writer.write(line.toJPEG());
                } else if (writer instanceof PNGWriter) {
                    writer.write(line.toPNG());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
