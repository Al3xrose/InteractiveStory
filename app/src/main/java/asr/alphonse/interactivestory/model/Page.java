package asr.alphonse.interactivestory.model;

/**
 * Created by alphonse on 3/23/2015.
 */
public class Page {
    private int mImageId;
    private String mText;
    private boolean mIsFinal = false;

    public Page(int imageID, String text, Choice choice1, Choice choice2){
        mImageId = imageID;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page(int imageID, String text)
    {
        mImageId = imageID;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;

        mIsFinal = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    private Choice mChoice1;
    private Choice mChoice2;


}
