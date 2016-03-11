package com.goit.gojavaonline;

import java.util.List;

/**
 * Created by amikhalnyuk on 11.03.2016.
 */
public class File {
    Directory Directory;
   private List<audio_file> audio_file;
   private List<video_file> video_file;
   private List<text_file> text_file;
   private List<Image_file> Image_file;

    public List<com.goit.gojavaonline.audio_file> getAudio_file() {
        return audio_file;
    }

    public void setAudio_file(List<com.goit.gojavaonline.audio_file> audio_file) {
        this.audio_file = audio_file;
    }

    public List<com.goit.gojavaonline.video_file> getVideo_file() {
        return video_file;
    }

    public void setVideo_file(List<com.goit.gojavaonline.video_file> video_file) {
        this.video_file = video_file;
    }

    public List<com.goit.gojavaonline.text_file> getText_file() {
        return text_file;
    }

    public void setText_file(List<com.goit.gojavaonline.text_file> text_file) {
        this.text_file = text_file;
    }

    public List<com.goit.gojavaonline.Image_file> getImage_file() {
        return Image_file;
    }

    public void setImage_file(List<com.goit.gojavaonline.Image_file> image_file) {
        Image_file = image_file;
    }
}
