package de.staticred.dbv2.files.filehandlers;

import de.staticred.dbv2.constants.FileConstants;
import de.staticred.dbv2.files.util.DBUtilFile;

import java.io.File;

/**
 * Manages all the messages in messages.yml
 *
 * @author Devin Fritz
 * @version 1.0.0
 */
public class MessagesFileHandler extends DBUtilFile {

    /**
     *
     * @param current the in resources
     */
    public MessagesFileHandler(File current) {
        super(current, FileConstants.RESOURCE_LOCATION + "messages.yml");
    }

    public String getPrefix() {
        return convertToMcString(configuration.getString(FileConstants.PREFIX));
    }

    public String getInvalidChannel() {
        return convertToMcString(configuration.getString(FileConstants.INVALID_CHANNEL));
    }

    public String getFooter() {
        return configuration.getString(FileConstants.FOOTER);
    }

    private String convertToMcString(String convertable) {
        return convertable.replaceAll("&", "§");
    }

    @Override
    public void afterLoad() {

    }
}
