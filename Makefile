RM = rm
RMF = rm -rf
MKDIR = mkdir

SOURCE_DIR = src

CLASS_DIR = classes

SRCS = $(wildcard $(SOURCE_DIR)/*.java)

CLASSES = $(SRCS:$(SOURCE_DIR)/%.java=$(CLASS_DIR)/%.class)

JC = javac
JCFLAGS = -d $(CLASS_DIR)/ -cp $(SOURCE_DIR)/

.SUFFIXES: .java

all: $(CLASSES)

$(CLASSES): $(CLASS_DIR)/%.class: $(SOURCE_DIR)/%.java
	$(JC) $(JCFLAGS) $<

clean:
	$(RM) $(CLASS_DIR)/*.class

fclean:
	$(RMF) $(CLASS_DIR)

re: fclean all

test:
	cd $(CLASS_DIR) && java Main
.PHONY: fclean all
