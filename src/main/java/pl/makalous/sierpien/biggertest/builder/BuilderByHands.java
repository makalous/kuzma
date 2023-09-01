package pl.makalous.sierpien.biggertest.builder;

import lombok.Getter;

@Getter
public class BuilderByHands {
    private Long number;
    private String textArea;

    private BuilderByHands() {
    }

    public static class Builder {
        private Long number;
        private String textArea;

        private Builder number(Long number) {
            this.number = number;
            return this;
        }

        private Builder textArea(String textArea) {
            this.textArea = textArea;
            return this;
        }

        public BuilderByHands build() {
            BuilderByHands builderByHands = new BuilderByHands();
            builderByHands.number = this.number;
            builderByHands.textArea = this.textArea;
            return builderByHands;
        }
    }
}
