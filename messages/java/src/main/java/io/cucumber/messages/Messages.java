package io.cucumber.messages;

public class Messages {

    public static class Attachment {
        private String body;
        private AttachmentContentEncoding contentEncoding;
        private String fileName;
        private String mediaType;
        private Source source;
        private String testCaseStartedId;
        private String testStepId;
        private String url;

        public Attachment() {}

        public Attachment(
            String body,
            AttachmentContentEncoding contentEncoding,
            String fileName,
            String mediaType,
            Source source,
            String testCaseStartedId,
            String testStepId,
            String url
        ) {
            this.body = java.util.Objects.requireNonNull(body, "Attachment.body cannot be null");
            this.contentEncoding = java.util.Objects.requireNonNull(contentEncoding, "Attachment.contentEncoding cannot be null");
            this.fileName = fileName;
            this.mediaType = java.util.Objects.requireNonNull(mediaType, "Attachment.mediaType cannot be null");
            this.source = source;
            this.testCaseStartedId = testCaseStartedId;
            this.testStepId = testStepId;
            this.url = url;
        }

        public String getBody() {
            return java.util.Objects.requireNonNull(body, "Attachment.body cannot be null");
        }

        public void setBody(String body) {
            this.body = java.util.Objects.requireNonNull(body, "Attachment.body cannot be null");
        }

        public AttachmentContentEncoding getContentEncoding() {
            return java.util.Objects.requireNonNull(contentEncoding, "Attachment.contentEncoding cannot be null");
        }

        public void setContentEncoding(AttachmentContentEncoding contentEncoding) {
            this.contentEncoding = java.util.Objects.requireNonNull(contentEncoding, "Attachment.contentEncoding cannot be null");
        }

        public java.util.Optional<String> getFileName() {
            return java.util.Optional.ofNullable(fileName);
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getMediaType() {
            return java.util.Objects.requireNonNull(mediaType, "Attachment.mediaType cannot be null");
        }

        public void setMediaType(String mediaType) {
            this.mediaType = java.util.Objects.requireNonNull(mediaType, "Attachment.mediaType cannot be null");
        }

        public java.util.Optional<Source> getSource() {
            return java.util.Optional.ofNullable(source);
        }

        public void setSource(Source source) {
            this.source = source;
        }

        public java.util.Optional<String> getTestCaseStartedId() {
            return java.util.Optional.ofNullable(testCaseStartedId);
        }

        public void setTestCaseStartedId(String testCaseStartedId) {
            this.testCaseStartedId = testCaseStartedId;
        }

        public java.util.Optional<String> getTestStepId() {
            return java.util.Optional.ofNullable(testStepId);
        }

        public void setTestStepId(String testStepId) {
            this.testStepId = testStepId;
        }

        public java.util.Optional<String> getUrl() {
            return java.util.Optional.ofNullable(url);
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void validate() {
            java.util.Objects.requireNonNull(body, "Attachment.body cannot be null");
            java.util.Objects.requireNonNull(contentEncoding, "Attachment.contentEncoding cannot be null");
            java.util.Objects.requireNonNull(mediaType, "Attachment.mediaType cannot be null");
            if (source != null) source.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Attachment that = (Attachment) o;
            return 
                body.equals(that.body) &&             
                contentEncoding.equals(that.contentEncoding) &&             
                java.util.Objects.equals(fileName, that.fileName) &&             
                mediaType.equals(that.mediaType) &&             
                java.util.Objects.equals(source, that.source) &&             
                java.util.Objects.equals(testCaseStartedId, that.testCaseStartedId) &&             
                java.util.Objects.equals(testStepId, that.testStepId) &&             
                java.util.Objects.equals(url, that.url);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                body,
                contentEncoding,
                fileName,
                mediaType,
                source,
                testCaseStartedId,
                testStepId,
                url
            );
        }

        @Override
        public String toString() {
            return "Attachment{" +
                "body=" + body +
                ", contentEncoding=" + contentEncoding +
                ", fileName=" + fileName +
                ", mediaType=" + mediaType +
                ", source=" + source +
                ", testCaseStartedId=" + testCaseStartedId +
                ", testStepId=" + testStepId +
                ", url=" + url +
                '}';
        }
    }


    public static class Duration {
        private Long seconds;
        private Long nanos;

        public Duration() {}

        public Duration(
            Long seconds,
            Long nanos
        ) {
            this.seconds = java.util.Objects.requireNonNull(seconds, "Duration.seconds cannot be null");
            this.nanos = java.util.Objects.requireNonNull(nanos, "Duration.nanos cannot be null");
        }

        public Long getSeconds() {
            return java.util.Objects.requireNonNull(seconds, "Duration.seconds cannot be null");
        }

        public void setSeconds(Long seconds) {
            this.seconds = java.util.Objects.requireNonNull(seconds, "Duration.seconds cannot be null");
        }

        public Long getNanos() {
            return java.util.Objects.requireNonNull(nanos, "Duration.nanos cannot be null");
        }

        public void setNanos(Long nanos) {
            this.nanos = java.util.Objects.requireNonNull(nanos, "Duration.nanos cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(seconds, "Duration.seconds cannot be null");
            java.util.Objects.requireNonNull(nanos, "Duration.nanos cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Duration that = (Duration) o;
            return 
                seconds.equals(that.seconds) &&             
                nanos.equals(that.nanos);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                seconds,
                nanos
            );
        }

        @Override
        public String toString() {
            return "Duration{" +
                "seconds=" + seconds +
                ", nanos=" + nanos +
                '}';
        }
    }


    public static class Envelope {
        private Attachment attachment;
        private GherkinDocument gherkinDocument;
        private Hook hook;
        private Meta meta;
        private ParameterType parameterType;
        private ParseError parseError;
        private Pickle pickle;
        private Source source;
        private StepDefinition stepDefinition;
        private TestCase testCase;
        private TestCaseFinished testCaseFinished;
        private TestCaseStarted testCaseStarted;
        private TestRunFinished testRunFinished;
        private TestRunStarted testRunStarted;
        private TestStepFinished testStepFinished;
        private TestStepStarted testStepStarted;
        private UndefinedParameterType undefinedParameterType;

        public Envelope() {}

        public Envelope(
            Attachment attachment,
            GherkinDocument gherkinDocument,
            Hook hook,
            Meta meta,
            ParameterType parameterType,
            ParseError parseError,
            Pickle pickle,
            Source source,
            StepDefinition stepDefinition,
            TestCase testCase,
            TestCaseFinished testCaseFinished,
            TestCaseStarted testCaseStarted,
            TestRunFinished testRunFinished,
            TestRunStarted testRunStarted,
            TestStepFinished testStepFinished,
            TestStepStarted testStepStarted,
            UndefinedParameterType undefinedParameterType
        ) {
            this.attachment = attachment;
            this.gherkinDocument = gherkinDocument;
            this.hook = hook;
            this.meta = meta;
            this.parameterType = parameterType;
            this.parseError = parseError;
            this.pickle = pickle;
            this.source = source;
            this.stepDefinition = stepDefinition;
            this.testCase = testCase;
            this.testCaseFinished = testCaseFinished;
            this.testCaseStarted = testCaseStarted;
            this.testRunFinished = testRunFinished;
            this.testRunStarted = testRunStarted;
            this.testStepFinished = testStepFinished;
            this.testStepStarted = testStepStarted;
            this.undefinedParameterType = undefinedParameterType;
        }

        public java.util.Optional<Attachment> getAttachment() {
            return java.util.Optional.ofNullable(attachment);
        }

        public void setAttachment(Attachment attachment) {
            this.attachment = attachment;
        }

        public java.util.Optional<GherkinDocument> getGherkinDocument() {
            return java.util.Optional.ofNullable(gherkinDocument);
        }

        public void setGherkinDocument(GherkinDocument gherkinDocument) {
            this.gherkinDocument = gherkinDocument;
        }

        public java.util.Optional<Hook> getHook() {
            return java.util.Optional.ofNullable(hook);
        }

        public void setHook(Hook hook) {
            this.hook = hook;
        }

        public java.util.Optional<Meta> getMeta() {
            return java.util.Optional.ofNullable(meta);
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }

        public java.util.Optional<ParameterType> getParameterType() {
            return java.util.Optional.ofNullable(parameterType);
        }

        public void setParameterType(ParameterType parameterType) {
            this.parameterType = parameterType;
        }

        public java.util.Optional<ParseError> getParseError() {
            return java.util.Optional.ofNullable(parseError);
        }

        public void setParseError(ParseError parseError) {
            this.parseError = parseError;
        }

        public java.util.Optional<Pickle> getPickle() {
            return java.util.Optional.ofNullable(pickle);
        }

        public void setPickle(Pickle pickle) {
            this.pickle = pickle;
        }

        public java.util.Optional<Source> getSource() {
            return java.util.Optional.ofNullable(source);
        }

        public void setSource(Source source) {
            this.source = source;
        }

        public java.util.Optional<StepDefinition> getStepDefinition() {
            return java.util.Optional.ofNullable(stepDefinition);
        }

        public void setStepDefinition(StepDefinition stepDefinition) {
            this.stepDefinition = stepDefinition;
        }

        public java.util.Optional<TestCase> getTestCase() {
            return java.util.Optional.ofNullable(testCase);
        }

        public void setTestCase(TestCase testCase) {
            this.testCase = testCase;
        }

        public java.util.Optional<TestCaseFinished> getTestCaseFinished() {
            return java.util.Optional.ofNullable(testCaseFinished);
        }

        public void setTestCaseFinished(TestCaseFinished testCaseFinished) {
            this.testCaseFinished = testCaseFinished;
        }

        public java.util.Optional<TestCaseStarted> getTestCaseStarted() {
            return java.util.Optional.ofNullable(testCaseStarted);
        }

        public void setTestCaseStarted(TestCaseStarted testCaseStarted) {
            this.testCaseStarted = testCaseStarted;
        }

        public java.util.Optional<TestRunFinished> getTestRunFinished() {
            return java.util.Optional.ofNullable(testRunFinished);
        }

        public void setTestRunFinished(TestRunFinished testRunFinished) {
            this.testRunFinished = testRunFinished;
        }

        public java.util.Optional<TestRunStarted> getTestRunStarted() {
            return java.util.Optional.ofNullable(testRunStarted);
        }

        public void setTestRunStarted(TestRunStarted testRunStarted) {
            this.testRunStarted = testRunStarted;
        }

        public java.util.Optional<TestStepFinished> getTestStepFinished() {
            return java.util.Optional.ofNullable(testStepFinished);
        }

        public void setTestStepFinished(TestStepFinished testStepFinished) {
            this.testStepFinished = testStepFinished;
        }

        public java.util.Optional<TestStepStarted> getTestStepStarted() {
            return java.util.Optional.ofNullable(testStepStarted);
        }

        public void setTestStepStarted(TestStepStarted testStepStarted) {
            this.testStepStarted = testStepStarted;
        }

        public java.util.Optional<UndefinedParameterType> getUndefinedParameterType() {
            return java.util.Optional.ofNullable(undefinedParameterType);
        }

        public void setUndefinedParameterType(UndefinedParameterType undefinedParameterType) {
            this.undefinedParameterType = undefinedParameterType;
        }

        public void validate() {
            if (attachment != null) attachment.validate();
            if (gherkinDocument != null) gherkinDocument.validate();
            if (hook != null) hook.validate();
            if (meta != null) meta.validate();
            if (parameterType != null) parameterType.validate();
            if (parseError != null) parseError.validate();
            if (pickle != null) pickle.validate();
            if (source != null) source.validate();
            if (stepDefinition != null) stepDefinition.validate();
            if (testCase != null) testCase.validate();
            if (testCaseFinished != null) testCaseFinished.validate();
            if (testCaseStarted != null) testCaseStarted.validate();
            if (testRunFinished != null) testRunFinished.validate();
            if (testRunStarted != null) testRunStarted.validate();
            if (testStepFinished != null) testStepFinished.validate();
            if (testStepStarted != null) testStepStarted.validate();
            if (undefinedParameterType != null) undefinedParameterType.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Envelope that = (Envelope) o;
            return 
                java.util.Objects.equals(attachment, that.attachment) &&             
                java.util.Objects.equals(gherkinDocument, that.gherkinDocument) &&             
                java.util.Objects.equals(hook, that.hook) &&             
                java.util.Objects.equals(meta, that.meta) &&             
                java.util.Objects.equals(parameterType, that.parameterType) &&             
                java.util.Objects.equals(parseError, that.parseError) &&             
                java.util.Objects.equals(pickle, that.pickle) &&             
                java.util.Objects.equals(source, that.source) &&             
                java.util.Objects.equals(stepDefinition, that.stepDefinition) &&             
                java.util.Objects.equals(testCase, that.testCase) &&             
                java.util.Objects.equals(testCaseFinished, that.testCaseFinished) &&             
                java.util.Objects.equals(testCaseStarted, that.testCaseStarted) &&             
                java.util.Objects.equals(testRunFinished, that.testRunFinished) &&             
                java.util.Objects.equals(testRunStarted, that.testRunStarted) &&             
                java.util.Objects.equals(testStepFinished, that.testStepFinished) &&             
                java.util.Objects.equals(testStepStarted, that.testStepStarted) &&             
                java.util.Objects.equals(undefinedParameterType, that.undefinedParameterType);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                attachment,
                gherkinDocument,
                hook,
                meta,
                parameterType,
                parseError,
                pickle,
                source,
                stepDefinition,
                testCase,
                testCaseFinished,
                testCaseStarted,
                testRunFinished,
                testRunStarted,
                testStepFinished,
                testStepStarted,
                undefinedParameterType
            );
        }

        @Override
        public String toString() {
            return "Envelope{" +
                "attachment=" + attachment +
                ", gherkinDocument=" + gherkinDocument +
                ", hook=" + hook +
                ", meta=" + meta +
                ", parameterType=" + parameterType +
                ", parseError=" + parseError +
                ", pickle=" + pickle +
                ", source=" + source +
                ", stepDefinition=" + stepDefinition +
                ", testCase=" + testCase +
                ", testCaseFinished=" + testCaseFinished +
                ", testCaseStarted=" + testCaseStarted +
                ", testRunFinished=" + testRunFinished +
                ", testRunStarted=" + testRunStarted +
                ", testStepFinished=" + testStepFinished +
                ", testStepStarted=" + testStepStarted +
                ", undefinedParameterType=" + undefinedParameterType +
                '}';
        }
    }


    public static class GherkinDocument {
        private String uri;
        private Feature feature;
        private java.util.List<Comment> comments = new java.util.ArrayList<>();

        public GherkinDocument() {}

        public GherkinDocument(
            String uri,
            Feature feature,
            java.util.List<Comment> comments
        ) {
            this.uri = uri;
            this.feature = feature;
            this.comments = java.util.Objects.requireNonNull(comments, "GherkinDocument.comments cannot be null");
        }

        public java.util.Optional<String> getUri() {
            return java.util.Optional.ofNullable(uri);
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public java.util.Optional<Feature> getFeature() {
            return java.util.Optional.ofNullable(feature);
        }

        public void setFeature(Feature feature) {
            this.feature = feature;
        }

        public java.util.List<Comment> getComments() {
            return java.util.Objects.requireNonNull(comments, "GherkinDocument.comments cannot be null");
        }

        public void setComments(java.util.List<Comment> comments) {
            this.comments = java.util.Objects.requireNonNull(comments, "GherkinDocument.comments cannot be null");
        }

        public void validate() {
            if (feature != null) feature.validate();
            java.util.Objects.requireNonNull(comments, "GherkinDocument.comments cannot be null");
            comments.forEach(Comment::validate);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GherkinDocument that = (GherkinDocument) o;
            return 
                java.util.Objects.equals(uri, that.uri) &&             
                java.util.Objects.equals(feature, that.feature) &&             
                comments.equals(that.comments);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                uri,
                feature,
                comments
            );
        }

        @Override
        public String toString() {
            return "GherkinDocument{" +
                "uri=" + uri +
                ", feature=" + feature +
                ", comments=" + comments +
                '}';
        }
    }


    public static class Background {
        private Location location;
        private String keyword;
        private String name;
        private String description;
        private java.util.List<Step> steps = new java.util.ArrayList<>();
        private String id;

        public Background() {}

        public Background(
            Location location,
            String keyword,
            String name,
            String description,
            java.util.List<Step> steps,
            String id
        ) {
            this.location = java.util.Objects.requireNonNull(location, "Background.location cannot be null");
            this.keyword = java.util.Objects.requireNonNull(keyword, "Background.keyword cannot be null");
            this.name = java.util.Objects.requireNonNull(name, "Background.name cannot be null");
            this.description = java.util.Objects.requireNonNull(description, "Background.description cannot be null");
            this.steps = java.util.Objects.requireNonNull(steps, "Background.steps cannot be null");
            this.id = java.util.Objects.requireNonNull(id, "Background.id cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "Background.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "Background.location cannot be null");
        }

        public String getKeyword() {
            return java.util.Objects.requireNonNull(keyword, "Background.keyword cannot be null");
        }

        public void setKeyword(String keyword) {
            this.keyword = java.util.Objects.requireNonNull(keyword, "Background.keyword cannot be null");
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "Background.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "Background.name cannot be null");
        }

        public String getDescription() {
            return java.util.Objects.requireNonNull(description, "Background.description cannot be null");
        }

        public void setDescription(String description) {
            this.description = java.util.Objects.requireNonNull(description, "Background.description cannot be null");
        }

        public java.util.List<Step> getSteps() {
            return java.util.Objects.requireNonNull(steps, "Background.steps cannot be null");
        }

        public void setSteps(java.util.List<Step> steps) {
            this.steps = java.util.Objects.requireNonNull(steps, "Background.steps cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "Background.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "Background.id cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "Background.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(keyword, "Background.keyword cannot be null");
            java.util.Objects.requireNonNull(name, "Background.name cannot be null");
            java.util.Objects.requireNonNull(description, "Background.description cannot be null");
            java.util.Objects.requireNonNull(steps, "Background.steps cannot be null");
            steps.forEach(Step::validate);
            java.util.Objects.requireNonNull(id, "Background.id cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Background that = (Background) o;
            return 
                location.equals(that.location) &&             
                keyword.equals(that.keyword) &&             
                name.equals(that.name) &&             
                description.equals(that.description) &&             
                steps.equals(that.steps) &&             
                id.equals(that.id);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                keyword,
                name,
                description,
                steps,
                id
            );
        }

        @Override
        public String toString() {
            return "Background{" +
                "location=" + location +
                ", keyword=" + keyword +
                ", name=" + name +
                ", description=" + description +
                ", steps=" + steps +
                ", id=" + id +
                '}';
        }
    }


    public static class Comment {
        private Location location;
        private String text;

        public Comment() {}

        public Comment(
            Location location,
            String text
        ) {
            this.location = java.util.Objects.requireNonNull(location, "Comment.location cannot be null");
            this.text = java.util.Objects.requireNonNull(text, "Comment.text cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "Comment.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "Comment.location cannot be null");
        }

        public String getText() {
            return java.util.Objects.requireNonNull(text, "Comment.text cannot be null");
        }

        public void setText(String text) {
            this.text = java.util.Objects.requireNonNull(text, "Comment.text cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "Comment.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(text, "Comment.text cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Comment that = (Comment) o;
            return 
                location.equals(that.location) &&             
                text.equals(that.text);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                text
            );
        }

        @Override
        public String toString() {
            return "Comment{" +
                "location=" + location +
                ", text=" + text +
                '}';
        }
    }


    public static class DataTable {
        private Location location;
        private java.util.List<TableRow> rows = new java.util.ArrayList<>();

        public DataTable() {}

        public DataTable(
            Location location,
            java.util.List<TableRow> rows
        ) {
            this.location = java.util.Objects.requireNonNull(location, "DataTable.location cannot be null");
            this.rows = java.util.Objects.requireNonNull(rows, "DataTable.rows cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "DataTable.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "DataTable.location cannot be null");
        }

        public java.util.List<TableRow> getRows() {
            return java.util.Objects.requireNonNull(rows, "DataTable.rows cannot be null");
        }

        public void setRows(java.util.List<TableRow> rows) {
            this.rows = java.util.Objects.requireNonNull(rows, "DataTable.rows cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "DataTable.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(rows, "DataTable.rows cannot be null");
            rows.forEach(TableRow::validate);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DataTable that = (DataTable) o;
            return 
                location.equals(that.location) &&             
                rows.equals(that.rows);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                rows
            );
        }

        @Override
        public String toString() {
            return "DataTable{" +
                "location=" + location +
                ", rows=" + rows +
                '}';
        }
    }


    public static class DocString {
        private Location location;
        private String mediaType;
        private String content;
        private String delimiter;

        public DocString() {}

        public DocString(
            Location location,
            String mediaType,
            String content,
            String delimiter
        ) {
            this.location = java.util.Objects.requireNonNull(location, "DocString.location cannot be null");
            this.mediaType = mediaType;
            this.content = java.util.Objects.requireNonNull(content, "DocString.content cannot be null");
            this.delimiter = java.util.Objects.requireNonNull(delimiter, "DocString.delimiter cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "DocString.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "DocString.location cannot be null");
        }

        public java.util.Optional<String> getMediaType() {
            return java.util.Optional.ofNullable(mediaType);
        }

        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        public String getContent() {
            return java.util.Objects.requireNonNull(content, "DocString.content cannot be null");
        }

        public void setContent(String content) {
            this.content = java.util.Objects.requireNonNull(content, "DocString.content cannot be null");
        }

        public String getDelimiter() {
            return java.util.Objects.requireNonNull(delimiter, "DocString.delimiter cannot be null");
        }

        public void setDelimiter(String delimiter) {
            this.delimiter = java.util.Objects.requireNonNull(delimiter, "DocString.delimiter cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "DocString.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(content, "DocString.content cannot be null");
            java.util.Objects.requireNonNull(delimiter, "DocString.delimiter cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DocString that = (DocString) o;
            return 
                location.equals(that.location) &&             
                java.util.Objects.equals(mediaType, that.mediaType) &&             
                content.equals(that.content) &&             
                delimiter.equals(that.delimiter);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                mediaType,
                content,
                delimiter
            );
        }

        @Override
        public String toString() {
            return "DocString{" +
                "location=" + location +
                ", mediaType=" + mediaType +
                ", content=" + content +
                ", delimiter=" + delimiter +
                '}';
        }
    }


    public static class Examples {
        private Location location;
        private java.util.List<Tag> tags = new java.util.ArrayList<>();
        private String keyword;
        private String name;
        private String description;
        private TableRow tableHeader;
        private java.util.List<TableRow> tableBody = new java.util.ArrayList<>();
        private String id;

        public Examples() {}

        public Examples(
            Location location,
            java.util.List<Tag> tags,
            String keyword,
            String name,
            String description,
            TableRow tableHeader,
            java.util.List<TableRow> tableBody,
            String id
        ) {
            this.location = java.util.Objects.requireNonNull(location, "Examples.location cannot be null");
            this.tags = java.util.Objects.requireNonNull(tags, "Examples.tags cannot be null");
            this.keyword = java.util.Objects.requireNonNull(keyword, "Examples.keyword cannot be null");
            this.name = java.util.Objects.requireNonNull(name, "Examples.name cannot be null");
            this.description = java.util.Objects.requireNonNull(description, "Examples.description cannot be null");
            this.tableHeader = tableHeader;
            this.tableBody = java.util.Objects.requireNonNull(tableBody, "Examples.tableBody cannot be null");
            this.id = java.util.Objects.requireNonNull(id, "Examples.id cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "Examples.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "Examples.location cannot be null");
        }

        public java.util.List<Tag> getTags() {
            return java.util.Objects.requireNonNull(tags, "Examples.tags cannot be null");
        }

        public void setTags(java.util.List<Tag> tags) {
            this.tags = java.util.Objects.requireNonNull(tags, "Examples.tags cannot be null");
        }

        public String getKeyword() {
            return java.util.Objects.requireNonNull(keyword, "Examples.keyword cannot be null");
        }

        public void setKeyword(String keyword) {
            this.keyword = java.util.Objects.requireNonNull(keyword, "Examples.keyword cannot be null");
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "Examples.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "Examples.name cannot be null");
        }

        public String getDescription() {
            return java.util.Objects.requireNonNull(description, "Examples.description cannot be null");
        }

        public void setDescription(String description) {
            this.description = java.util.Objects.requireNonNull(description, "Examples.description cannot be null");
        }

        public java.util.Optional<TableRow> getTableHeader() {
            return java.util.Optional.ofNullable(tableHeader);
        }

        public void setTableHeader(TableRow tableHeader) {
            this.tableHeader = tableHeader;
        }

        public java.util.List<TableRow> getTableBody() {
            return java.util.Objects.requireNonNull(tableBody, "Examples.tableBody cannot be null");
        }

        public void setTableBody(java.util.List<TableRow> tableBody) {
            this.tableBody = java.util.Objects.requireNonNull(tableBody, "Examples.tableBody cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "Examples.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "Examples.id cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "Examples.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(tags, "Examples.tags cannot be null");
            tags.forEach(Tag::validate);
            java.util.Objects.requireNonNull(keyword, "Examples.keyword cannot be null");
            java.util.Objects.requireNonNull(name, "Examples.name cannot be null");
            java.util.Objects.requireNonNull(description, "Examples.description cannot be null");
            if (tableHeader != null) tableHeader.validate();
            java.util.Objects.requireNonNull(tableBody, "Examples.tableBody cannot be null");
            tableBody.forEach(TableRow::validate);
            java.util.Objects.requireNonNull(id, "Examples.id cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Examples that = (Examples) o;
            return 
                location.equals(that.location) &&             
                tags.equals(that.tags) &&             
                keyword.equals(that.keyword) &&             
                name.equals(that.name) &&             
                description.equals(that.description) &&             
                java.util.Objects.equals(tableHeader, that.tableHeader) &&             
                tableBody.equals(that.tableBody) &&             
                id.equals(that.id);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                tags,
                keyword,
                name,
                description,
                tableHeader,
                tableBody,
                id
            );
        }

        @Override
        public String toString() {
            return "Examples{" +
                "location=" + location +
                ", tags=" + tags +
                ", keyword=" + keyword +
                ", name=" + name +
                ", description=" + description +
                ", tableHeader=" + tableHeader +
                ", tableBody=" + tableBody +
                ", id=" + id +
                '}';
        }
    }


    public static class Feature {
        private Location location;
        private java.util.List<Tag> tags = new java.util.ArrayList<>();
        private String language;
        private String keyword;
        private String name;
        private String description;
        private java.util.List<FeatureChild> children = new java.util.ArrayList<>();

        public Feature() {}

        public Feature(
            Location location,
            java.util.List<Tag> tags,
            String language,
            String keyword,
            String name,
            String description,
            java.util.List<FeatureChild> children
        ) {
            this.location = java.util.Objects.requireNonNull(location, "Feature.location cannot be null");
            this.tags = java.util.Objects.requireNonNull(tags, "Feature.tags cannot be null");
            this.language = java.util.Objects.requireNonNull(language, "Feature.language cannot be null");
            this.keyword = java.util.Objects.requireNonNull(keyword, "Feature.keyword cannot be null");
            this.name = java.util.Objects.requireNonNull(name, "Feature.name cannot be null");
            this.description = java.util.Objects.requireNonNull(description, "Feature.description cannot be null");
            this.children = java.util.Objects.requireNonNull(children, "Feature.children cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "Feature.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "Feature.location cannot be null");
        }

        public java.util.List<Tag> getTags() {
            return java.util.Objects.requireNonNull(tags, "Feature.tags cannot be null");
        }

        public void setTags(java.util.List<Tag> tags) {
            this.tags = java.util.Objects.requireNonNull(tags, "Feature.tags cannot be null");
        }

        public String getLanguage() {
            return java.util.Objects.requireNonNull(language, "Feature.language cannot be null");
        }

        public void setLanguage(String language) {
            this.language = java.util.Objects.requireNonNull(language, "Feature.language cannot be null");
        }

        public String getKeyword() {
            return java.util.Objects.requireNonNull(keyword, "Feature.keyword cannot be null");
        }

        public void setKeyword(String keyword) {
            this.keyword = java.util.Objects.requireNonNull(keyword, "Feature.keyword cannot be null");
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "Feature.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "Feature.name cannot be null");
        }

        public String getDescription() {
            return java.util.Objects.requireNonNull(description, "Feature.description cannot be null");
        }

        public void setDescription(String description) {
            this.description = java.util.Objects.requireNonNull(description, "Feature.description cannot be null");
        }

        public java.util.List<FeatureChild> getChildren() {
            return java.util.Objects.requireNonNull(children, "Feature.children cannot be null");
        }

        public void setChildren(java.util.List<FeatureChild> children) {
            this.children = java.util.Objects.requireNonNull(children, "Feature.children cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "Feature.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(tags, "Feature.tags cannot be null");
            tags.forEach(Tag::validate);
            java.util.Objects.requireNonNull(language, "Feature.language cannot be null");
            java.util.Objects.requireNonNull(keyword, "Feature.keyword cannot be null");
            java.util.Objects.requireNonNull(name, "Feature.name cannot be null");
            java.util.Objects.requireNonNull(description, "Feature.description cannot be null");
            java.util.Objects.requireNonNull(children, "Feature.children cannot be null");
            children.forEach(FeatureChild::validate);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Feature that = (Feature) o;
            return 
                location.equals(that.location) &&             
                tags.equals(that.tags) &&             
                language.equals(that.language) &&             
                keyword.equals(that.keyword) &&             
                name.equals(that.name) &&             
                description.equals(that.description) &&             
                children.equals(that.children);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                tags,
                language,
                keyword,
                name,
                description,
                children
            );
        }

        @Override
        public String toString() {
            return "Feature{" +
                "location=" + location +
                ", tags=" + tags +
                ", language=" + language +
                ", keyword=" + keyword +
                ", name=" + name +
                ", description=" + description +
                ", children=" + children +
                '}';
        }
    }


    public static class FeatureChild {
        private Rule rule;
        private Background background;
        private Scenario scenario;

        public FeatureChild() {}

        public FeatureChild(
            Rule rule,
            Background background,
            Scenario scenario
        ) {
            this.rule = rule;
            this.background = background;
            this.scenario = scenario;
        }

        public java.util.Optional<Rule> getRule() {
            return java.util.Optional.ofNullable(rule);
        }

        public void setRule(Rule rule) {
            this.rule = rule;
        }

        public java.util.Optional<Background> getBackground() {
            return java.util.Optional.ofNullable(background);
        }

        public void setBackground(Background background) {
            this.background = background;
        }

        public java.util.Optional<Scenario> getScenario() {
            return java.util.Optional.ofNullable(scenario);
        }

        public void setScenario(Scenario scenario) {
            this.scenario = scenario;
        }

        public void validate() {
            if (rule != null) rule.validate();
            if (background != null) background.validate();
            if (scenario != null) scenario.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FeatureChild that = (FeatureChild) o;
            return 
                java.util.Objects.equals(rule, that.rule) &&             
                java.util.Objects.equals(background, that.background) &&             
                java.util.Objects.equals(scenario, that.scenario);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                rule,
                background,
                scenario
            );
        }

        @Override
        public String toString() {
            return "FeatureChild{" +
                "rule=" + rule +
                ", background=" + background +
                ", scenario=" + scenario +
                '}';
        }
    }


    public static class Rule {
        private Location location;
        private java.util.List<Tag> tags = new java.util.ArrayList<>();
        private String keyword;
        private String name;
        private String description;
        private java.util.List<RuleChild> children = new java.util.ArrayList<>();
        private String id;

        public Rule() {}

        public Rule(
            Location location,
            java.util.List<Tag> tags,
            String keyword,
            String name,
            String description,
            java.util.List<RuleChild> children,
            String id
        ) {
            this.location = java.util.Objects.requireNonNull(location, "Rule.location cannot be null");
            this.tags = java.util.Objects.requireNonNull(tags, "Rule.tags cannot be null");
            this.keyword = java.util.Objects.requireNonNull(keyword, "Rule.keyword cannot be null");
            this.name = java.util.Objects.requireNonNull(name, "Rule.name cannot be null");
            this.description = java.util.Objects.requireNonNull(description, "Rule.description cannot be null");
            this.children = java.util.Objects.requireNonNull(children, "Rule.children cannot be null");
            this.id = java.util.Objects.requireNonNull(id, "Rule.id cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "Rule.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "Rule.location cannot be null");
        }

        public java.util.List<Tag> getTags() {
            return java.util.Objects.requireNonNull(tags, "Rule.tags cannot be null");
        }

        public void setTags(java.util.List<Tag> tags) {
            this.tags = java.util.Objects.requireNonNull(tags, "Rule.tags cannot be null");
        }

        public String getKeyword() {
            return java.util.Objects.requireNonNull(keyword, "Rule.keyword cannot be null");
        }

        public void setKeyword(String keyword) {
            this.keyword = java.util.Objects.requireNonNull(keyword, "Rule.keyword cannot be null");
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "Rule.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "Rule.name cannot be null");
        }

        public String getDescription() {
            return java.util.Objects.requireNonNull(description, "Rule.description cannot be null");
        }

        public void setDescription(String description) {
            this.description = java.util.Objects.requireNonNull(description, "Rule.description cannot be null");
        }

        public java.util.List<RuleChild> getChildren() {
            return java.util.Objects.requireNonNull(children, "Rule.children cannot be null");
        }

        public void setChildren(java.util.List<RuleChild> children) {
            this.children = java.util.Objects.requireNonNull(children, "Rule.children cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "Rule.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "Rule.id cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "Rule.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(tags, "Rule.tags cannot be null");
            tags.forEach(Tag::validate);
            java.util.Objects.requireNonNull(keyword, "Rule.keyword cannot be null");
            java.util.Objects.requireNonNull(name, "Rule.name cannot be null");
            java.util.Objects.requireNonNull(description, "Rule.description cannot be null");
            java.util.Objects.requireNonNull(children, "Rule.children cannot be null");
            children.forEach(RuleChild::validate);
            java.util.Objects.requireNonNull(id, "Rule.id cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Rule that = (Rule) o;
            return 
                location.equals(that.location) &&             
                tags.equals(that.tags) &&             
                keyword.equals(that.keyword) &&             
                name.equals(that.name) &&             
                description.equals(that.description) &&             
                children.equals(that.children) &&             
                id.equals(that.id);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                tags,
                keyword,
                name,
                description,
                children,
                id
            );
        }

        @Override
        public String toString() {
            return "Rule{" +
                "location=" + location +
                ", tags=" + tags +
                ", keyword=" + keyword +
                ", name=" + name +
                ", description=" + description +
                ", children=" + children +
                ", id=" + id +
                '}';
        }
    }


    public static class RuleChild {
        private Background background;
        private Scenario scenario;

        public RuleChild() {}

        public RuleChild(
            Background background,
            Scenario scenario
        ) {
            this.background = background;
            this.scenario = scenario;
        }

        public java.util.Optional<Background> getBackground() {
            return java.util.Optional.ofNullable(background);
        }

        public void setBackground(Background background) {
            this.background = background;
        }

        public java.util.Optional<Scenario> getScenario() {
            return java.util.Optional.ofNullable(scenario);
        }

        public void setScenario(Scenario scenario) {
            this.scenario = scenario;
        }

        public void validate() {
            if (background != null) background.validate();
            if (scenario != null) scenario.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RuleChild that = (RuleChild) o;
            return 
                java.util.Objects.equals(background, that.background) &&             
                java.util.Objects.equals(scenario, that.scenario);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                background,
                scenario
            );
        }

        @Override
        public String toString() {
            return "RuleChild{" +
                "background=" + background +
                ", scenario=" + scenario +
                '}';
        }
    }


    public static class Scenario {
        private Location location;
        private java.util.List<Tag> tags = new java.util.ArrayList<>();
        private String keyword;
        private String name;
        private String description;
        private java.util.List<Step> steps = new java.util.ArrayList<>();
        private java.util.List<Examples> examples = new java.util.ArrayList<>();
        private String id;

        public Scenario() {}

        public Scenario(
            Location location,
            java.util.List<Tag> tags,
            String keyword,
            String name,
            String description,
            java.util.List<Step> steps,
            java.util.List<Examples> examples,
            String id
        ) {
            this.location = java.util.Objects.requireNonNull(location, "Scenario.location cannot be null");
            this.tags = java.util.Objects.requireNonNull(tags, "Scenario.tags cannot be null");
            this.keyword = java.util.Objects.requireNonNull(keyword, "Scenario.keyword cannot be null");
            this.name = java.util.Objects.requireNonNull(name, "Scenario.name cannot be null");
            this.description = java.util.Objects.requireNonNull(description, "Scenario.description cannot be null");
            this.steps = java.util.Objects.requireNonNull(steps, "Scenario.steps cannot be null");
            this.examples = java.util.Objects.requireNonNull(examples, "Scenario.examples cannot be null");
            this.id = java.util.Objects.requireNonNull(id, "Scenario.id cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "Scenario.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "Scenario.location cannot be null");
        }

        public java.util.List<Tag> getTags() {
            return java.util.Objects.requireNonNull(tags, "Scenario.tags cannot be null");
        }

        public void setTags(java.util.List<Tag> tags) {
            this.tags = java.util.Objects.requireNonNull(tags, "Scenario.tags cannot be null");
        }

        public String getKeyword() {
            return java.util.Objects.requireNonNull(keyword, "Scenario.keyword cannot be null");
        }

        public void setKeyword(String keyword) {
            this.keyword = java.util.Objects.requireNonNull(keyword, "Scenario.keyword cannot be null");
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "Scenario.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "Scenario.name cannot be null");
        }

        public String getDescription() {
            return java.util.Objects.requireNonNull(description, "Scenario.description cannot be null");
        }

        public void setDescription(String description) {
            this.description = java.util.Objects.requireNonNull(description, "Scenario.description cannot be null");
        }

        public java.util.List<Step> getSteps() {
            return java.util.Objects.requireNonNull(steps, "Scenario.steps cannot be null");
        }

        public void setSteps(java.util.List<Step> steps) {
            this.steps = java.util.Objects.requireNonNull(steps, "Scenario.steps cannot be null");
        }

        public java.util.List<Examples> getExamples() {
            return java.util.Objects.requireNonNull(examples, "Scenario.examples cannot be null");
        }

        public void setExamples(java.util.List<Examples> examples) {
            this.examples = java.util.Objects.requireNonNull(examples, "Scenario.examples cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "Scenario.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "Scenario.id cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "Scenario.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(tags, "Scenario.tags cannot be null");
            tags.forEach(Tag::validate);
            java.util.Objects.requireNonNull(keyword, "Scenario.keyword cannot be null");
            java.util.Objects.requireNonNull(name, "Scenario.name cannot be null");
            java.util.Objects.requireNonNull(description, "Scenario.description cannot be null");
            java.util.Objects.requireNonNull(steps, "Scenario.steps cannot be null");
            steps.forEach(Step::validate);
            java.util.Objects.requireNonNull(examples, "Scenario.examples cannot be null");
            examples.forEach(Examples::validate);
            java.util.Objects.requireNonNull(id, "Scenario.id cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Scenario that = (Scenario) o;
            return 
                location.equals(that.location) &&             
                tags.equals(that.tags) &&             
                keyword.equals(that.keyword) &&             
                name.equals(that.name) &&             
                description.equals(that.description) &&             
                steps.equals(that.steps) &&             
                examples.equals(that.examples) &&             
                id.equals(that.id);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                tags,
                keyword,
                name,
                description,
                steps,
                examples,
                id
            );
        }

        @Override
        public String toString() {
            return "Scenario{" +
                "location=" + location +
                ", tags=" + tags +
                ", keyword=" + keyword +
                ", name=" + name +
                ", description=" + description +
                ", steps=" + steps +
                ", examples=" + examples +
                ", id=" + id +
                '}';
        }
    }


    public static class Step {
        private Location location;
        private String keyword;
        private String text;
        private DocString docString;
        private DataTable dataTable;
        private String id;

        public Step() {}

        public Step(
            Location location,
            String keyword,
            String text,
            DocString docString,
            DataTable dataTable,
            String id
        ) {
            this.location = java.util.Objects.requireNonNull(location, "Step.location cannot be null");
            this.keyword = java.util.Objects.requireNonNull(keyword, "Step.keyword cannot be null");
            this.text = java.util.Objects.requireNonNull(text, "Step.text cannot be null");
            this.docString = docString;
            this.dataTable = dataTable;
            this.id = java.util.Objects.requireNonNull(id, "Step.id cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "Step.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "Step.location cannot be null");
        }

        public String getKeyword() {
            return java.util.Objects.requireNonNull(keyword, "Step.keyword cannot be null");
        }

        public void setKeyword(String keyword) {
            this.keyword = java.util.Objects.requireNonNull(keyword, "Step.keyword cannot be null");
        }

        public String getText() {
            return java.util.Objects.requireNonNull(text, "Step.text cannot be null");
        }

        public void setText(String text) {
            this.text = java.util.Objects.requireNonNull(text, "Step.text cannot be null");
        }

        public java.util.Optional<DocString> getDocString() {
            return java.util.Optional.ofNullable(docString);
        }

        public void setDocString(DocString docString) {
            this.docString = docString;
        }

        public java.util.Optional<DataTable> getDataTable() {
            return java.util.Optional.ofNullable(dataTable);
        }

        public void setDataTable(DataTable dataTable) {
            this.dataTable = dataTable;
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "Step.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "Step.id cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "Step.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(keyword, "Step.keyword cannot be null");
            java.util.Objects.requireNonNull(text, "Step.text cannot be null");
            if (docString != null) docString.validate();
            if (dataTable != null) dataTable.validate();
            java.util.Objects.requireNonNull(id, "Step.id cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Step that = (Step) o;
            return 
                location.equals(that.location) &&             
                keyword.equals(that.keyword) &&             
                text.equals(that.text) &&             
                java.util.Objects.equals(docString, that.docString) &&             
                java.util.Objects.equals(dataTable, that.dataTable) &&             
                id.equals(that.id);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                keyword,
                text,
                docString,
                dataTable,
                id
            );
        }

        @Override
        public String toString() {
            return "Step{" +
                "location=" + location +
                ", keyword=" + keyword +
                ", text=" + text +
                ", docString=" + docString +
                ", dataTable=" + dataTable +
                ", id=" + id +
                '}';
        }
    }


    public static class TableCell {
        private Location location;
        private String value;

        public TableCell() {}

        public TableCell(
            Location location,
            String value
        ) {
            this.location = java.util.Objects.requireNonNull(location, "TableCell.location cannot be null");
            this.value = java.util.Objects.requireNonNull(value, "TableCell.value cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "TableCell.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "TableCell.location cannot be null");
        }

        public String getValue() {
            return java.util.Objects.requireNonNull(value, "TableCell.value cannot be null");
        }

        public void setValue(String value) {
            this.value = java.util.Objects.requireNonNull(value, "TableCell.value cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "TableCell.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(value, "TableCell.value cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TableCell that = (TableCell) o;
            return 
                location.equals(that.location) &&             
                value.equals(that.value);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                value
            );
        }

        @Override
        public String toString() {
            return "TableCell{" +
                "location=" + location +
                ", value=" + value +
                '}';
        }
    }


    public static class TableRow {
        private Location location;
        private java.util.List<TableCell> cells = new java.util.ArrayList<>();
        private String id;

        public TableRow() {}

        public TableRow(
            Location location,
            java.util.List<TableCell> cells,
            String id
        ) {
            this.location = java.util.Objects.requireNonNull(location, "TableRow.location cannot be null");
            this.cells = java.util.Objects.requireNonNull(cells, "TableRow.cells cannot be null");
            this.id = java.util.Objects.requireNonNull(id, "TableRow.id cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "TableRow.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "TableRow.location cannot be null");
        }

        public java.util.List<TableCell> getCells() {
            return java.util.Objects.requireNonNull(cells, "TableRow.cells cannot be null");
        }

        public void setCells(java.util.List<TableCell> cells) {
            this.cells = java.util.Objects.requireNonNull(cells, "TableRow.cells cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "TableRow.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "TableRow.id cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "TableRow.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(cells, "TableRow.cells cannot be null");
            cells.forEach(TableCell::validate);
            java.util.Objects.requireNonNull(id, "TableRow.id cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TableRow that = (TableRow) o;
            return 
                location.equals(that.location) &&             
                cells.equals(that.cells) &&             
                id.equals(that.id);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                cells,
                id
            );
        }

        @Override
        public String toString() {
            return "TableRow{" +
                "location=" + location +
                ", cells=" + cells +
                ", id=" + id +
                '}';
        }
    }


    public static class Tag {
        private Location location;
        private String name;
        private String id;

        public Tag() {}

        public Tag(
            Location location,
            String name,
            String id
        ) {
            this.location = java.util.Objects.requireNonNull(location, "Tag.location cannot be null");
            this.name = java.util.Objects.requireNonNull(name, "Tag.name cannot be null");
            this.id = java.util.Objects.requireNonNull(id, "Tag.id cannot be null");
        }

        public Location getLocation() {
            return java.util.Objects.requireNonNull(location, "Tag.location cannot be null");
        }

        public void setLocation(Location location) {
            this.location = java.util.Objects.requireNonNull(location, "Tag.location cannot be null");
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "Tag.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "Tag.name cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "Tag.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "Tag.id cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(location, "Tag.location cannot be null");
            location.validate();
            java.util.Objects.requireNonNull(name, "Tag.name cannot be null");
            java.util.Objects.requireNonNull(id, "Tag.id cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tag that = (Tag) o;
            return 
                location.equals(that.location) &&             
                name.equals(that.name) &&             
                id.equals(that.id);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                location,
                name,
                id
            );
        }

        @Override
        public String toString() {
            return "Tag{" +
                "location=" + location +
                ", name=" + name +
                ", id=" + id +
                '}';
        }
    }


    public static class Hook {
        private String id;
        private SourceReference sourceReference;
        private String tagExpression;

        public Hook() {}

        public Hook(
            String id,
            SourceReference sourceReference,
            String tagExpression
        ) {
            this.id = java.util.Objects.requireNonNull(id, "Hook.id cannot be null");
            this.sourceReference = java.util.Objects.requireNonNull(sourceReference, "Hook.sourceReference cannot be null");
            this.tagExpression = tagExpression;
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "Hook.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "Hook.id cannot be null");
        }

        public SourceReference getSourceReference() {
            return java.util.Objects.requireNonNull(sourceReference, "Hook.sourceReference cannot be null");
        }

        public void setSourceReference(SourceReference sourceReference) {
            this.sourceReference = java.util.Objects.requireNonNull(sourceReference, "Hook.sourceReference cannot be null");
        }

        public java.util.Optional<String> getTagExpression() {
            return java.util.Optional.ofNullable(tagExpression);
        }

        public void setTagExpression(String tagExpression) {
            this.tagExpression = tagExpression;
        }

        public void validate() {
            java.util.Objects.requireNonNull(id, "Hook.id cannot be null");
            java.util.Objects.requireNonNull(sourceReference, "Hook.sourceReference cannot be null");
            sourceReference.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Hook that = (Hook) o;
            return 
                id.equals(that.id) &&             
                sourceReference.equals(that.sourceReference) &&             
                java.util.Objects.equals(tagExpression, that.tagExpression);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                id,
                sourceReference,
                tagExpression
            );
        }

        @Override
        public String toString() {
            return "Hook{" +
                "id=" + id +
                ", sourceReference=" + sourceReference +
                ", tagExpression=" + tagExpression +
                '}';
        }
    }


    public static class Location {
        private Long line;
        private Long column;

        public Location() {}

        public Location(
            Long line,
            Long column
        ) {
            this.line = java.util.Objects.requireNonNull(line, "Location.line cannot be null");
            this.column = column;
        }

        public Long getLine() {
            return java.util.Objects.requireNonNull(line, "Location.line cannot be null");
        }

        public void setLine(Long line) {
            this.line = java.util.Objects.requireNonNull(line, "Location.line cannot be null");
        }

        public java.util.Optional<Long> getColumn() {
            return java.util.Optional.ofNullable(column);
        }

        public void setColumn(Long column) {
            this.column = column;
        }

        public void validate() {
            java.util.Objects.requireNonNull(line, "Location.line cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Location that = (Location) o;
            return 
                line.equals(that.line) &&             
                java.util.Objects.equals(column, that.column);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                line,
                column
            );
        }

        @Override
        public String toString() {
            return "Location{" +
                "line=" + line +
                ", column=" + column +
                '}';
        }
    }


    public static class Meta {
        private String protocolVersion;
        private Product implementation;
        private Product runtime;
        private Product os;
        private Product cpu;
        private Ci ci;

        public Meta() {}

        public Meta(
            String protocolVersion,
            Product implementation,
            Product runtime,
            Product os,
            Product cpu,
            Ci ci
        ) {
            this.protocolVersion = java.util.Objects.requireNonNull(protocolVersion, "Meta.protocolVersion cannot be null");
            this.implementation = java.util.Objects.requireNonNull(implementation, "Meta.implementation cannot be null");
            this.runtime = java.util.Objects.requireNonNull(runtime, "Meta.runtime cannot be null");
            this.os = java.util.Objects.requireNonNull(os, "Meta.os cannot be null");
            this.cpu = java.util.Objects.requireNonNull(cpu, "Meta.cpu cannot be null");
            this.ci = ci;
        }

        public String getProtocolVersion() {
            return java.util.Objects.requireNonNull(protocolVersion, "Meta.protocolVersion cannot be null");
        }

        public void setProtocolVersion(String protocolVersion) {
            this.protocolVersion = java.util.Objects.requireNonNull(protocolVersion, "Meta.protocolVersion cannot be null");
        }

        public Product getImplementation() {
            return java.util.Objects.requireNonNull(implementation, "Meta.implementation cannot be null");
        }

        public void setImplementation(Product implementation) {
            this.implementation = java.util.Objects.requireNonNull(implementation, "Meta.implementation cannot be null");
        }

        public Product getRuntime() {
            return java.util.Objects.requireNonNull(runtime, "Meta.runtime cannot be null");
        }

        public void setRuntime(Product runtime) {
            this.runtime = java.util.Objects.requireNonNull(runtime, "Meta.runtime cannot be null");
        }

        public Product getOs() {
            return java.util.Objects.requireNonNull(os, "Meta.os cannot be null");
        }

        public void setOs(Product os) {
            this.os = java.util.Objects.requireNonNull(os, "Meta.os cannot be null");
        }

        public Product getCpu() {
            return java.util.Objects.requireNonNull(cpu, "Meta.cpu cannot be null");
        }

        public void setCpu(Product cpu) {
            this.cpu = java.util.Objects.requireNonNull(cpu, "Meta.cpu cannot be null");
        }

        public java.util.Optional<Ci> getCi() {
            return java.util.Optional.ofNullable(ci);
        }

        public void setCi(Ci ci) {
            this.ci = ci;
        }

        public void validate() {
            java.util.Objects.requireNonNull(protocolVersion, "Meta.protocolVersion cannot be null");
            java.util.Objects.requireNonNull(implementation, "Meta.implementation cannot be null");
            implementation.validate();
            java.util.Objects.requireNonNull(runtime, "Meta.runtime cannot be null");
            runtime.validate();
            java.util.Objects.requireNonNull(os, "Meta.os cannot be null");
            os.validate();
            java.util.Objects.requireNonNull(cpu, "Meta.cpu cannot be null");
            cpu.validate();
            if (ci != null) ci.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Meta that = (Meta) o;
            return 
                protocolVersion.equals(that.protocolVersion) &&             
                implementation.equals(that.implementation) &&             
                runtime.equals(that.runtime) &&             
                os.equals(that.os) &&             
                cpu.equals(that.cpu) &&             
                java.util.Objects.equals(ci, that.ci);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                protocolVersion,
                implementation,
                runtime,
                os,
                cpu,
                ci
            );
        }

        @Override
        public String toString() {
            return "Meta{" +
                "protocolVersion=" + protocolVersion +
                ", implementation=" + implementation +
                ", runtime=" + runtime +
                ", os=" + os +
                ", cpu=" + cpu +
                ", ci=" + ci +
                '}';
        }
    }


    public static class Ci {
        private String name;
        private String url;
        private String buildNumber;
        private Git git;

        public Ci() {}

        public Ci(
            String name,
            String url,
            String buildNumber,
            Git git
        ) {
            this.name = java.util.Objects.requireNonNull(name, "Ci.name cannot be null");
            this.url = url;
            this.buildNumber = buildNumber;
            this.git = git;
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "Ci.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "Ci.name cannot be null");
        }

        public java.util.Optional<String> getUrl() {
            return java.util.Optional.ofNullable(url);
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public java.util.Optional<String> getBuildNumber() {
            return java.util.Optional.ofNullable(buildNumber);
        }

        public void setBuildNumber(String buildNumber) {
            this.buildNumber = buildNumber;
        }

        public java.util.Optional<Git> getGit() {
            return java.util.Optional.ofNullable(git);
        }

        public void setGit(Git git) {
            this.git = git;
        }

        public void validate() {
            java.util.Objects.requireNonNull(name, "Ci.name cannot be null");
            if (git != null) git.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ci that = (Ci) o;
            return 
                name.equals(that.name) &&             
                java.util.Objects.equals(url, that.url) &&             
                java.util.Objects.equals(buildNumber, that.buildNumber) &&             
                java.util.Objects.equals(git, that.git);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                name,
                url,
                buildNumber,
                git
            );
        }

        @Override
        public String toString() {
            return "Ci{" +
                "name=" + name +
                ", url=" + url +
                ", buildNumber=" + buildNumber +
                ", git=" + git +
                '}';
        }
    }


    public static class Git {
        private String remote;
        private String revision;
        private String branch;
        private String tag;

        public Git() {}

        public Git(
            String remote,
            String revision,
            String branch,
            String tag
        ) {
            this.remote = java.util.Objects.requireNonNull(remote, "Git.remote cannot be null");
            this.revision = java.util.Objects.requireNonNull(revision, "Git.revision cannot be null");
            this.branch = branch;
            this.tag = tag;
        }

        public String getRemote() {
            return java.util.Objects.requireNonNull(remote, "Git.remote cannot be null");
        }

        public void setRemote(String remote) {
            this.remote = java.util.Objects.requireNonNull(remote, "Git.remote cannot be null");
        }

        public String getRevision() {
            return java.util.Objects.requireNonNull(revision, "Git.revision cannot be null");
        }

        public void setRevision(String revision) {
            this.revision = java.util.Objects.requireNonNull(revision, "Git.revision cannot be null");
        }

        public java.util.Optional<String> getBranch() {
            return java.util.Optional.ofNullable(branch);
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }

        public java.util.Optional<String> getTag() {
            return java.util.Optional.ofNullable(tag);
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public void validate() {
            java.util.Objects.requireNonNull(remote, "Git.remote cannot be null");
            java.util.Objects.requireNonNull(revision, "Git.revision cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Git that = (Git) o;
            return 
                remote.equals(that.remote) &&             
                revision.equals(that.revision) &&             
                java.util.Objects.equals(branch, that.branch) &&             
                java.util.Objects.equals(tag, that.tag);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                remote,
                revision,
                branch,
                tag
            );
        }

        @Override
        public String toString() {
            return "Git{" +
                "remote=" + remote +
                ", revision=" + revision +
                ", branch=" + branch +
                ", tag=" + tag +
                '}';
        }
    }


    public static class Product {
        private String name;
        private String version;

        public Product() {}

        public Product(
            String name,
            String version
        ) {
            this.name = java.util.Objects.requireNonNull(name, "Product.name cannot be null");
            this.version = version;
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "Product.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "Product.name cannot be null");
        }

        public java.util.Optional<String> getVersion() {
            return java.util.Optional.ofNullable(version);
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public void validate() {
            java.util.Objects.requireNonNull(name, "Product.name cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product that = (Product) o;
            return 
                name.equals(that.name) &&             
                java.util.Objects.equals(version, that.version);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                name,
                version
            );
        }

        @Override
        public String toString() {
            return "Product{" +
                "name=" + name +
                ", version=" + version +
                '}';
        }
    }


    public static class ParameterType {
        private String name;
        private java.util.List<String> regularExpressions = new java.util.ArrayList<>();
        private Boolean preferForRegularExpressionMatch;
        private Boolean useForSnippets;
        private String id;

        public ParameterType() {}

        public ParameterType(
            String name,
            java.util.List<String> regularExpressions,
            Boolean preferForRegularExpressionMatch,
            Boolean useForSnippets,
            String id
        ) {
            this.name = java.util.Objects.requireNonNull(name, "ParameterType.name cannot be null");
            this.regularExpressions = java.util.Objects.requireNonNull(regularExpressions, "ParameterType.regularExpressions cannot be null");
            this.preferForRegularExpressionMatch = java.util.Objects.requireNonNull(preferForRegularExpressionMatch, "ParameterType.preferForRegularExpressionMatch cannot be null");
            this.useForSnippets = java.util.Objects.requireNonNull(useForSnippets, "ParameterType.useForSnippets cannot be null");
            this.id = java.util.Objects.requireNonNull(id, "ParameterType.id cannot be null");
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "ParameterType.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "ParameterType.name cannot be null");
        }

        public java.util.List<String> getRegularExpressions() {
            return java.util.Objects.requireNonNull(regularExpressions, "ParameterType.regularExpressions cannot be null");
        }

        public void setRegularExpressions(java.util.List<String> regularExpressions) {
            this.regularExpressions = java.util.Objects.requireNonNull(regularExpressions, "ParameterType.regularExpressions cannot be null");
        }

        public Boolean getPreferForRegularExpressionMatch() {
            return java.util.Objects.requireNonNull(preferForRegularExpressionMatch, "ParameterType.preferForRegularExpressionMatch cannot be null");
        }

        public void setPreferForRegularExpressionMatch(Boolean preferForRegularExpressionMatch) {
            this.preferForRegularExpressionMatch = java.util.Objects.requireNonNull(preferForRegularExpressionMatch, "ParameterType.preferForRegularExpressionMatch cannot be null");
        }

        public Boolean getUseForSnippets() {
            return java.util.Objects.requireNonNull(useForSnippets, "ParameterType.useForSnippets cannot be null");
        }

        public void setUseForSnippets(Boolean useForSnippets) {
            this.useForSnippets = java.util.Objects.requireNonNull(useForSnippets, "ParameterType.useForSnippets cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "ParameterType.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "ParameterType.id cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(name, "ParameterType.name cannot be null");
            java.util.Objects.requireNonNull(regularExpressions, "ParameterType.regularExpressions cannot be null");
            regularExpressions.forEach(e -> java.util.Objects.requireNonNull(e, "ParameterType.regularExpressions elements cannot be null"));
            java.util.Objects.requireNonNull(preferForRegularExpressionMatch, "ParameterType.preferForRegularExpressionMatch cannot be null");
            java.util.Objects.requireNonNull(useForSnippets, "ParameterType.useForSnippets cannot be null");
            java.util.Objects.requireNonNull(id, "ParameterType.id cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParameterType that = (ParameterType) o;
            return 
                name.equals(that.name) &&             
                regularExpressions.equals(that.regularExpressions) &&             
                preferForRegularExpressionMatch.equals(that.preferForRegularExpressionMatch) &&             
                useForSnippets.equals(that.useForSnippets) &&             
                id.equals(that.id);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                name,
                regularExpressions,
                preferForRegularExpressionMatch,
                useForSnippets,
                id
            );
        }

        @Override
        public String toString() {
            return "ParameterType{" +
                "name=" + name +
                ", regularExpressions=" + regularExpressions +
                ", preferForRegularExpressionMatch=" + preferForRegularExpressionMatch +
                ", useForSnippets=" + useForSnippets +
                ", id=" + id +
                '}';
        }
    }


    public static class ParseError {
        private SourceReference source;
        private String message;

        public ParseError() {}

        public ParseError(
            SourceReference source,
            String message
        ) {
            this.source = java.util.Objects.requireNonNull(source, "ParseError.source cannot be null");
            this.message = java.util.Objects.requireNonNull(message, "ParseError.message cannot be null");
        }

        public SourceReference getSource() {
            return java.util.Objects.requireNonNull(source, "ParseError.source cannot be null");
        }

        public void setSource(SourceReference source) {
            this.source = java.util.Objects.requireNonNull(source, "ParseError.source cannot be null");
        }

        public String getMessage() {
            return java.util.Objects.requireNonNull(message, "ParseError.message cannot be null");
        }

        public void setMessage(String message) {
            this.message = java.util.Objects.requireNonNull(message, "ParseError.message cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(source, "ParseError.source cannot be null");
            source.validate();
            java.util.Objects.requireNonNull(message, "ParseError.message cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParseError that = (ParseError) o;
            return 
                source.equals(that.source) &&             
                message.equals(that.message);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                source,
                message
            );
        }

        @Override
        public String toString() {
            return "ParseError{" +
                "source=" + source +
                ", message=" + message +
                '}';
        }
    }


    public static class Pickle {
        private String id;
        private String uri;
        private String name;
        private String language;
        private java.util.List<PickleStep> steps = new java.util.ArrayList<>();
        private java.util.List<PickleTag> tags = new java.util.ArrayList<>();
        private java.util.List<String> astNodeIds = new java.util.ArrayList<>();

        public Pickle() {}

        public Pickle(
            String id,
            String uri,
            String name,
            String language,
            java.util.List<PickleStep> steps,
            java.util.List<PickleTag> tags,
            java.util.List<String> astNodeIds
        ) {
            this.id = java.util.Objects.requireNonNull(id, "Pickle.id cannot be null");
            this.uri = java.util.Objects.requireNonNull(uri, "Pickle.uri cannot be null");
            this.name = java.util.Objects.requireNonNull(name, "Pickle.name cannot be null");
            this.language = java.util.Objects.requireNonNull(language, "Pickle.language cannot be null");
            this.steps = java.util.Objects.requireNonNull(steps, "Pickle.steps cannot be null");
            this.tags = java.util.Objects.requireNonNull(tags, "Pickle.tags cannot be null");
            this.astNodeIds = java.util.Objects.requireNonNull(astNodeIds, "Pickle.astNodeIds cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "Pickle.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "Pickle.id cannot be null");
        }

        public String getUri() {
            return java.util.Objects.requireNonNull(uri, "Pickle.uri cannot be null");
        }

        public void setUri(String uri) {
            this.uri = java.util.Objects.requireNonNull(uri, "Pickle.uri cannot be null");
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "Pickle.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "Pickle.name cannot be null");
        }

        public String getLanguage() {
            return java.util.Objects.requireNonNull(language, "Pickle.language cannot be null");
        }

        public void setLanguage(String language) {
            this.language = java.util.Objects.requireNonNull(language, "Pickle.language cannot be null");
        }

        public java.util.List<PickleStep> getSteps() {
            return java.util.Objects.requireNonNull(steps, "Pickle.steps cannot be null");
        }

        public void setSteps(java.util.List<PickleStep> steps) {
            this.steps = java.util.Objects.requireNonNull(steps, "Pickle.steps cannot be null");
        }

        public java.util.List<PickleTag> getTags() {
            return java.util.Objects.requireNonNull(tags, "Pickle.tags cannot be null");
        }

        public void setTags(java.util.List<PickleTag> tags) {
            this.tags = java.util.Objects.requireNonNull(tags, "Pickle.tags cannot be null");
        }

        public java.util.List<String> getAstNodeIds() {
            return java.util.Objects.requireNonNull(astNodeIds, "Pickle.astNodeIds cannot be null");
        }

        public void setAstNodeIds(java.util.List<String> astNodeIds) {
            this.astNodeIds = java.util.Objects.requireNonNull(astNodeIds, "Pickle.astNodeIds cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(id, "Pickle.id cannot be null");
            java.util.Objects.requireNonNull(uri, "Pickle.uri cannot be null");
            java.util.Objects.requireNonNull(name, "Pickle.name cannot be null");
            java.util.Objects.requireNonNull(language, "Pickle.language cannot be null");
            java.util.Objects.requireNonNull(steps, "Pickle.steps cannot be null");
            steps.forEach(PickleStep::validate);
            java.util.Objects.requireNonNull(tags, "Pickle.tags cannot be null");
            tags.forEach(PickleTag::validate);
            java.util.Objects.requireNonNull(astNodeIds, "Pickle.astNodeIds cannot be null");
            astNodeIds.forEach(e -> java.util.Objects.requireNonNull(e, "Pickle.astNodeIds elements cannot be null"));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pickle that = (Pickle) o;
            return 
                id.equals(that.id) &&             
                uri.equals(that.uri) &&             
                name.equals(that.name) &&             
                language.equals(that.language) &&             
                steps.equals(that.steps) &&             
                tags.equals(that.tags) &&             
                astNodeIds.equals(that.astNodeIds);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                id,
                uri,
                name,
                language,
                steps,
                tags,
                astNodeIds
            );
        }

        @Override
        public String toString() {
            return "Pickle{" +
                "id=" + id +
                ", uri=" + uri +
                ", name=" + name +
                ", language=" + language +
                ", steps=" + steps +
                ", tags=" + tags +
                ", astNodeIds=" + astNodeIds +
                '}';
        }
    }


    public static class PickleDocString {
        private String mediaType;
        private String content;

        public PickleDocString() {}

        public PickleDocString(
            String mediaType,
            String content
        ) {
            this.mediaType = mediaType;
            this.content = java.util.Objects.requireNonNull(content, "PickleDocString.content cannot be null");
        }

        public java.util.Optional<String> getMediaType() {
            return java.util.Optional.ofNullable(mediaType);
        }

        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        public String getContent() {
            return java.util.Objects.requireNonNull(content, "PickleDocString.content cannot be null");
        }

        public void setContent(String content) {
            this.content = java.util.Objects.requireNonNull(content, "PickleDocString.content cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(content, "PickleDocString.content cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PickleDocString that = (PickleDocString) o;
            return 
                java.util.Objects.equals(mediaType, that.mediaType) &&             
                content.equals(that.content);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                mediaType,
                content
            );
        }

        @Override
        public String toString() {
            return "PickleDocString{" +
                "mediaType=" + mediaType +
                ", content=" + content +
                '}';
        }
    }


    public static class PickleStep {
        private PickleStepArgument argument;
        private java.util.List<String> astNodeIds = new java.util.ArrayList<>();
        private String id;
        private String text;

        public PickleStep() {}

        public PickleStep(
            PickleStepArgument argument,
            java.util.List<String> astNodeIds,
            String id,
            String text
        ) {
            this.argument = argument;
            this.astNodeIds = java.util.Objects.requireNonNull(astNodeIds, "PickleStep.astNodeIds cannot be null");
            this.id = java.util.Objects.requireNonNull(id, "PickleStep.id cannot be null");
            this.text = java.util.Objects.requireNonNull(text, "PickleStep.text cannot be null");
        }

        public java.util.Optional<PickleStepArgument> getArgument() {
            return java.util.Optional.ofNullable(argument);
        }

        public void setArgument(PickleStepArgument argument) {
            this.argument = argument;
        }

        public java.util.List<String> getAstNodeIds() {
            return java.util.Objects.requireNonNull(astNodeIds, "PickleStep.astNodeIds cannot be null");
        }

        public void setAstNodeIds(java.util.List<String> astNodeIds) {
            this.astNodeIds = java.util.Objects.requireNonNull(astNodeIds, "PickleStep.astNodeIds cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "PickleStep.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "PickleStep.id cannot be null");
        }

        public String getText() {
            return java.util.Objects.requireNonNull(text, "PickleStep.text cannot be null");
        }

        public void setText(String text) {
            this.text = java.util.Objects.requireNonNull(text, "PickleStep.text cannot be null");
        }

        public void validate() {
            if (argument != null) argument.validate();
            java.util.Objects.requireNonNull(astNodeIds, "PickleStep.astNodeIds cannot be null");
            astNodeIds.forEach(e -> java.util.Objects.requireNonNull(e, "PickleStep.astNodeIds elements cannot be null"));
            java.util.Objects.requireNonNull(id, "PickleStep.id cannot be null");
            java.util.Objects.requireNonNull(text, "PickleStep.text cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PickleStep that = (PickleStep) o;
            return 
                java.util.Objects.equals(argument, that.argument) &&             
                astNodeIds.equals(that.astNodeIds) &&             
                id.equals(that.id) &&             
                text.equals(that.text);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                argument,
                astNodeIds,
                id,
                text
            );
        }

        @Override
        public String toString() {
            return "PickleStep{" +
                "argument=" + argument +
                ", astNodeIds=" + astNodeIds +
                ", id=" + id +
                ", text=" + text +
                '}';
        }
    }


    public static class PickleStepArgument {
        private PickleDocString docString;
        private PickleTable dataTable;

        public PickleStepArgument() {}

        public PickleStepArgument(
            PickleDocString docString,
            PickleTable dataTable
        ) {
            this.docString = docString;
            this.dataTable = dataTable;
        }

        public java.util.Optional<PickleDocString> getDocString() {
            return java.util.Optional.ofNullable(docString);
        }

        public void setDocString(PickleDocString docString) {
            this.docString = docString;
        }

        public java.util.Optional<PickleTable> getDataTable() {
            return java.util.Optional.ofNullable(dataTable);
        }

        public void setDataTable(PickleTable dataTable) {
            this.dataTable = dataTable;
        }

        public void validate() {
            if (docString != null) docString.validate();
            if (dataTable != null) dataTable.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PickleStepArgument that = (PickleStepArgument) o;
            return 
                java.util.Objects.equals(docString, that.docString) &&             
                java.util.Objects.equals(dataTable, that.dataTable);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                docString,
                dataTable
            );
        }

        @Override
        public String toString() {
            return "PickleStepArgument{" +
                "docString=" + docString +
                ", dataTable=" + dataTable +
                '}';
        }
    }


    public static class PickleTable {
        private java.util.List<PickleTableRow> rows = new java.util.ArrayList<>();

        public PickleTable() {}

        public PickleTable(
            java.util.List<PickleTableRow> rows
        ) {
            this.rows = java.util.Objects.requireNonNull(rows, "PickleTable.rows cannot be null");
        }

        public java.util.List<PickleTableRow> getRows() {
            return java.util.Objects.requireNonNull(rows, "PickleTable.rows cannot be null");
        }

        public void setRows(java.util.List<PickleTableRow> rows) {
            this.rows = java.util.Objects.requireNonNull(rows, "PickleTable.rows cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(rows, "PickleTable.rows cannot be null");
            rows.forEach(PickleTableRow::validate);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PickleTable that = (PickleTable) o;
            return 
                rows.equals(that.rows);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                rows
            );
        }

        @Override
        public String toString() {
            return "PickleTable{" +
                "rows=" + rows +
                '}';
        }
    }


    public static class PickleTableCell {
        private String value;

        public PickleTableCell() {}

        public PickleTableCell(
            String value
        ) {
            this.value = java.util.Objects.requireNonNull(value, "PickleTableCell.value cannot be null");
        }

        public String getValue() {
            return java.util.Objects.requireNonNull(value, "PickleTableCell.value cannot be null");
        }

        public void setValue(String value) {
            this.value = java.util.Objects.requireNonNull(value, "PickleTableCell.value cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(value, "PickleTableCell.value cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PickleTableCell that = (PickleTableCell) o;
            return 
                value.equals(that.value);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                value
            );
        }

        @Override
        public String toString() {
            return "PickleTableCell{" +
                "value=" + value +
                '}';
        }
    }


    public static class PickleTableRow {
        private java.util.List<PickleTableCell> cells = new java.util.ArrayList<>();

        public PickleTableRow() {}

        public PickleTableRow(
            java.util.List<PickleTableCell> cells
        ) {
            this.cells = java.util.Objects.requireNonNull(cells, "PickleTableRow.cells cannot be null");
        }

        public java.util.List<PickleTableCell> getCells() {
            return java.util.Objects.requireNonNull(cells, "PickleTableRow.cells cannot be null");
        }

        public void setCells(java.util.List<PickleTableCell> cells) {
            this.cells = java.util.Objects.requireNonNull(cells, "PickleTableRow.cells cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(cells, "PickleTableRow.cells cannot be null");
            cells.forEach(PickleTableCell::validate);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PickleTableRow that = (PickleTableRow) o;
            return 
                cells.equals(that.cells);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                cells
            );
        }

        @Override
        public String toString() {
            return "PickleTableRow{" +
                "cells=" + cells +
                '}';
        }
    }


    public static class PickleTag {
        private String name;
        private String astNodeId;

        public PickleTag() {}

        public PickleTag(
            String name,
            String astNodeId
        ) {
            this.name = java.util.Objects.requireNonNull(name, "PickleTag.name cannot be null");
            this.astNodeId = java.util.Objects.requireNonNull(astNodeId, "PickleTag.astNodeId cannot be null");
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "PickleTag.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "PickleTag.name cannot be null");
        }

        public String getAstNodeId() {
            return java.util.Objects.requireNonNull(astNodeId, "PickleTag.astNodeId cannot be null");
        }

        public void setAstNodeId(String astNodeId) {
            this.astNodeId = java.util.Objects.requireNonNull(astNodeId, "PickleTag.astNodeId cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(name, "PickleTag.name cannot be null");
            java.util.Objects.requireNonNull(astNodeId, "PickleTag.astNodeId cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PickleTag that = (PickleTag) o;
            return 
                name.equals(that.name) &&             
                astNodeId.equals(that.astNodeId);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                name,
                astNodeId
            );
        }

        @Override
        public String toString() {
            return "PickleTag{" +
                "name=" + name +
                ", astNodeId=" + astNodeId +
                '}';
        }
    }


    public static class Source {
        private String uri;
        private String data;
        private SourceMediaType mediaType;

        public Source() {}

        public Source(
            String uri,
            String data,
            SourceMediaType mediaType
        ) {
            this.uri = java.util.Objects.requireNonNull(uri, "Source.uri cannot be null");
            this.data = java.util.Objects.requireNonNull(data, "Source.data cannot be null");
            this.mediaType = java.util.Objects.requireNonNull(mediaType, "Source.mediaType cannot be null");
        }

        public String getUri() {
            return java.util.Objects.requireNonNull(uri, "Source.uri cannot be null");
        }

        public void setUri(String uri) {
            this.uri = java.util.Objects.requireNonNull(uri, "Source.uri cannot be null");
        }

        public String getData() {
            return java.util.Objects.requireNonNull(data, "Source.data cannot be null");
        }

        public void setData(String data) {
            this.data = java.util.Objects.requireNonNull(data, "Source.data cannot be null");
        }

        public SourceMediaType getMediaType() {
            return java.util.Objects.requireNonNull(mediaType, "Source.mediaType cannot be null");
        }

        public void setMediaType(SourceMediaType mediaType) {
            this.mediaType = java.util.Objects.requireNonNull(mediaType, "Source.mediaType cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(uri, "Source.uri cannot be null");
            java.util.Objects.requireNonNull(data, "Source.data cannot be null");
            java.util.Objects.requireNonNull(mediaType, "Source.mediaType cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Source that = (Source) o;
            return 
                uri.equals(that.uri) &&             
                data.equals(that.data) &&             
                mediaType.equals(that.mediaType);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                uri,
                data,
                mediaType
            );
        }

        @Override
        public String toString() {
            return "Source{" +
                "uri=" + uri +
                ", data=" + data +
                ", mediaType=" + mediaType +
                '}';
        }
    }


    public static class SourceReference {
        private String uri;
        private JavaMethod javaMethod;
        private JavaStackTraceElement javaStackTraceElement;
        private Location location;

        public SourceReference() {}

        public SourceReference(
            String uri,
            JavaMethod javaMethod,
            JavaStackTraceElement javaStackTraceElement,
            Location location
        ) {
            this.uri = uri;
            this.javaMethod = javaMethod;
            this.javaStackTraceElement = javaStackTraceElement;
            this.location = location;
        }

        public java.util.Optional<String> getUri() {
            return java.util.Optional.ofNullable(uri);
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public java.util.Optional<JavaMethod> getJavaMethod() {
            return java.util.Optional.ofNullable(javaMethod);
        }

        public void setJavaMethod(JavaMethod javaMethod) {
            this.javaMethod = javaMethod;
        }

        public java.util.Optional<JavaStackTraceElement> getJavaStackTraceElement() {
            return java.util.Optional.ofNullable(javaStackTraceElement);
        }

        public void setJavaStackTraceElement(JavaStackTraceElement javaStackTraceElement) {
            this.javaStackTraceElement = javaStackTraceElement;
        }

        public java.util.Optional<Location> getLocation() {
            return java.util.Optional.ofNullable(location);
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public void validate() {
            if (javaMethod != null) javaMethod.validate();
            if (javaStackTraceElement != null) javaStackTraceElement.validate();
            if (location != null) location.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SourceReference that = (SourceReference) o;
            return 
                java.util.Objects.equals(uri, that.uri) &&             
                java.util.Objects.equals(javaMethod, that.javaMethod) &&             
                java.util.Objects.equals(javaStackTraceElement, that.javaStackTraceElement) &&             
                java.util.Objects.equals(location, that.location);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                uri,
                javaMethod,
                javaStackTraceElement,
                location
            );
        }

        @Override
        public String toString() {
            return "SourceReference{" +
                "uri=" + uri +
                ", javaMethod=" + javaMethod +
                ", javaStackTraceElement=" + javaStackTraceElement +
                ", location=" + location +
                '}';
        }
    }


    public static class JavaMethod {
        private String className;
        private String methodName;
        private java.util.List<String> methodParameterTypes = new java.util.ArrayList<>();

        public JavaMethod() {}

        public JavaMethod(
            String className,
            String methodName,
            java.util.List<String> methodParameterTypes
        ) {
            this.className = java.util.Objects.requireNonNull(className, "JavaMethod.className cannot be null");
            this.methodName = java.util.Objects.requireNonNull(methodName, "JavaMethod.methodName cannot be null");
            this.methodParameterTypes = java.util.Objects.requireNonNull(methodParameterTypes, "JavaMethod.methodParameterTypes cannot be null");
        }

        public String getClassName() {
            return java.util.Objects.requireNonNull(className, "JavaMethod.className cannot be null");
        }

        public void setClassName(String className) {
            this.className = java.util.Objects.requireNonNull(className, "JavaMethod.className cannot be null");
        }

        public String getMethodName() {
            return java.util.Objects.requireNonNull(methodName, "JavaMethod.methodName cannot be null");
        }

        public void setMethodName(String methodName) {
            this.methodName = java.util.Objects.requireNonNull(methodName, "JavaMethod.methodName cannot be null");
        }

        public java.util.List<String> getMethodParameterTypes() {
            return java.util.Objects.requireNonNull(methodParameterTypes, "JavaMethod.methodParameterTypes cannot be null");
        }

        public void setMethodParameterTypes(java.util.List<String> methodParameterTypes) {
            this.methodParameterTypes = java.util.Objects.requireNonNull(methodParameterTypes, "JavaMethod.methodParameterTypes cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(className, "JavaMethod.className cannot be null");
            java.util.Objects.requireNonNull(methodName, "JavaMethod.methodName cannot be null");
            java.util.Objects.requireNonNull(methodParameterTypes, "JavaMethod.methodParameterTypes cannot be null");
            methodParameterTypes.forEach(e -> java.util.Objects.requireNonNull(e, "JavaMethod.methodParameterTypes elements cannot be null"));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            JavaMethod that = (JavaMethod) o;
            return 
                className.equals(that.className) &&             
                methodName.equals(that.methodName) &&             
                methodParameterTypes.equals(that.methodParameterTypes);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                className,
                methodName,
                methodParameterTypes
            );
        }

        @Override
        public String toString() {
            return "JavaMethod{" +
                "className=" + className +
                ", methodName=" + methodName +
                ", methodParameterTypes=" + methodParameterTypes +
                '}';
        }
    }


    public static class JavaStackTraceElement {
        private String className;
        private String fileName;
        private String methodName;

        public JavaStackTraceElement() {}

        public JavaStackTraceElement(
            String className,
            String fileName,
            String methodName
        ) {
            this.className = java.util.Objects.requireNonNull(className, "JavaStackTraceElement.className cannot be null");
            this.fileName = java.util.Objects.requireNonNull(fileName, "JavaStackTraceElement.fileName cannot be null");
            this.methodName = java.util.Objects.requireNonNull(methodName, "JavaStackTraceElement.methodName cannot be null");
        }

        public String getClassName() {
            return java.util.Objects.requireNonNull(className, "JavaStackTraceElement.className cannot be null");
        }

        public void setClassName(String className) {
            this.className = java.util.Objects.requireNonNull(className, "JavaStackTraceElement.className cannot be null");
        }

        public String getFileName() {
            return java.util.Objects.requireNonNull(fileName, "JavaStackTraceElement.fileName cannot be null");
        }

        public void setFileName(String fileName) {
            this.fileName = java.util.Objects.requireNonNull(fileName, "JavaStackTraceElement.fileName cannot be null");
        }

        public String getMethodName() {
            return java.util.Objects.requireNonNull(methodName, "JavaStackTraceElement.methodName cannot be null");
        }

        public void setMethodName(String methodName) {
            this.methodName = java.util.Objects.requireNonNull(methodName, "JavaStackTraceElement.methodName cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(className, "JavaStackTraceElement.className cannot be null");
            java.util.Objects.requireNonNull(fileName, "JavaStackTraceElement.fileName cannot be null");
            java.util.Objects.requireNonNull(methodName, "JavaStackTraceElement.methodName cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            JavaStackTraceElement that = (JavaStackTraceElement) o;
            return 
                className.equals(that.className) &&             
                fileName.equals(that.fileName) &&             
                methodName.equals(that.methodName);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                className,
                fileName,
                methodName
            );
        }

        @Override
        public String toString() {
            return "JavaStackTraceElement{" +
                "className=" + className +
                ", fileName=" + fileName +
                ", methodName=" + methodName +
                '}';
        }
    }


    public static class StepDefinition {
        private String id;
        private StepDefinitionPattern pattern;
        private SourceReference sourceReference;

        public StepDefinition() {}

        public StepDefinition(
            String id,
            StepDefinitionPattern pattern,
            SourceReference sourceReference
        ) {
            this.id = java.util.Objects.requireNonNull(id, "StepDefinition.id cannot be null");
            this.pattern = java.util.Objects.requireNonNull(pattern, "StepDefinition.pattern cannot be null");
            this.sourceReference = java.util.Objects.requireNonNull(sourceReference, "StepDefinition.sourceReference cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "StepDefinition.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "StepDefinition.id cannot be null");
        }

        public StepDefinitionPattern getPattern() {
            return java.util.Objects.requireNonNull(pattern, "StepDefinition.pattern cannot be null");
        }

        public void setPattern(StepDefinitionPattern pattern) {
            this.pattern = java.util.Objects.requireNonNull(pattern, "StepDefinition.pattern cannot be null");
        }

        public SourceReference getSourceReference() {
            return java.util.Objects.requireNonNull(sourceReference, "StepDefinition.sourceReference cannot be null");
        }

        public void setSourceReference(SourceReference sourceReference) {
            this.sourceReference = java.util.Objects.requireNonNull(sourceReference, "StepDefinition.sourceReference cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(id, "StepDefinition.id cannot be null");
            java.util.Objects.requireNonNull(pattern, "StepDefinition.pattern cannot be null");
            pattern.validate();
            java.util.Objects.requireNonNull(sourceReference, "StepDefinition.sourceReference cannot be null");
            sourceReference.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StepDefinition that = (StepDefinition) o;
            return 
                id.equals(that.id) &&             
                pattern.equals(that.pattern) &&             
                sourceReference.equals(that.sourceReference);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                id,
                pattern,
                sourceReference
            );
        }

        @Override
        public String toString() {
            return "StepDefinition{" +
                "id=" + id +
                ", pattern=" + pattern +
                ", sourceReference=" + sourceReference +
                '}';
        }
    }


    public static class StepDefinitionPattern {
        private String source;
        private StepDefinitionPatternType type;

        public StepDefinitionPattern() {}

        public StepDefinitionPattern(
            String source,
            StepDefinitionPatternType type
        ) {
            this.source = java.util.Objects.requireNonNull(source, "StepDefinitionPattern.source cannot be null");
            this.type = java.util.Objects.requireNonNull(type, "StepDefinitionPattern.type cannot be null");
        }

        public String getSource() {
            return java.util.Objects.requireNonNull(source, "StepDefinitionPattern.source cannot be null");
        }

        public void setSource(String source) {
            this.source = java.util.Objects.requireNonNull(source, "StepDefinitionPattern.source cannot be null");
        }

        public StepDefinitionPatternType getType() {
            return java.util.Objects.requireNonNull(type, "StepDefinitionPattern.type cannot be null");
        }

        public void setType(StepDefinitionPatternType type) {
            this.type = java.util.Objects.requireNonNull(type, "StepDefinitionPattern.type cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(source, "StepDefinitionPattern.source cannot be null");
            java.util.Objects.requireNonNull(type, "StepDefinitionPattern.type cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StepDefinitionPattern that = (StepDefinitionPattern) o;
            return 
                source.equals(that.source) &&             
                type.equals(that.type);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                source,
                type
            );
        }

        @Override
        public String toString() {
            return "StepDefinitionPattern{" +
                "source=" + source +
                ", type=" + type +
                '}';
        }
    }


    public static class TestCase {
        private String id;
        private String pickleId;
        private java.util.List<TestStep> testSteps = new java.util.ArrayList<>();

        public TestCase() {}

        public TestCase(
            String id,
            String pickleId,
            java.util.List<TestStep> testSteps
        ) {
            this.id = java.util.Objects.requireNonNull(id, "TestCase.id cannot be null");
            this.pickleId = java.util.Objects.requireNonNull(pickleId, "TestCase.pickleId cannot be null");
            this.testSteps = java.util.Objects.requireNonNull(testSteps, "TestCase.testSteps cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "TestCase.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "TestCase.id cannot be null");
        }

        public String getPickleId() {
            return java.util.Objects.requireNonNull(pickleId, "TestCase.pickleId cannot be null");
        }

        public void setPickleId(String pickleId) {
            this.pickleId = java.util.Objects.requireNonNull(pickleId, "TestCase.pickleId cannot be null");
        }

        public java.util.List<TestStep> getTestSteps() {
            return java.util.Objects.requireNonNull(testSteps, "TestCase.testSteps cannot be null");
        }

        public void setTestSteps(java.util.List<TestStep> testSteps) {
            this.testSteps = java.util.Objects.requireNonNull(testSteps, "TestCase.testSteps cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(id, "TestCase.id cannot be null");
            java.util.Objects.requireNonNull(pickleId, "TestCase.pickleId cannot be null");
            java.util.Objects.requireNonNull(testSteps, "TestCase.testSteps cannot be null");
            testSteps.forEach(TestStep::validate);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestCase that = (TestCase) o;
            return 
                id.equals(that.id) &&             
                pickleId.equals(that.pickleId) &&             
                testSteps.equals(that.testSteps);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                id,
                pickleId,
                testSteps
            );
        }

        @Override
        public String toString() {
            return "TestCase{" +
                "id=" + id +
                ", pickleId=" + pickleId +
                ", testSteps=" + testSteps +
                '}';
        }
    }


    public static class Group {
        private java.util.List<Group> children = new java.util.ArrayList<>();
        private Long start;
        private String value;

        public Group() {}

        public Group(
            java.util.List<Group> children,
            Long start,
            String value
        ) {
            this.children = java.util.Objects.requireNonNull(children, "Group.children cannot be null");
            this.start = start;
            this.value = value;
        }

        public java.util.List<Group> getChildren() {
            return java.util.Objects.requireNonNull(children, "Group.children cannot be null");
        }

        public void setChildren(java.util.List<Group> children) {
            this.children = java.util.Objects.requireNonNull(children, "Group.children cannot be null");
        }

        public java.util.Optional<Long> getStart() {
            return java.util.Optional.ofNullable(start);
        }

        public void setStart(Long start) {
            this.start = start;
        }

        public java.util.Optional<String> getValue() {
            return java.util.Optional.ofNullable(value);
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void validate() {
            java.util.Objects.requireNonNull(children, "Group.children cannot be null");
            children.forEach(Group::validate);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Group that = (Group) o;
            return 
                children.equals(that.children) &&             
                java.util.Objects.equals(start, that.start) &&             
                java.util.Objects.equals(value, that.value);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                children,
                start,
                value
            );
        }

        @Override
        public String toString() {
            return "Group{" +
                "children=" + children +
                ", start=" + start +
                ", value=" + value +
                '}';
        }
    }


    public static class StepMatchArgument {
        private Group group;
        private String parameterTypeName;

        public StepMatchArgument() {}

        public StepMatchArgument(
            Group group,
            String parameterTypeName
        ) {
            this.group = java.util.Objects.requireNonNull(group, "StepMatchArgument.group cannot be null");
            this.parameterTypeName = parameterTypeName;
        }

        public Group getGroup() {
            return java.util.Objects.requireNonNull(group, "StepMatchArgument.group cannot be null");
        }

        public void setGroup(Group group) {
            this.group = java.util.Objects.requireNonNull(group, "StepMatchArgument.group cannot be null");
        }

        public java.util.Optional<String> getParameterTypeName() {
            return java.util.Optional.ofNullable(parameterTypeName);
        }

        public void setParameterTypeName(String parameterTypeName) {
            this.parameterTypeName = parameterTypeName;
        }

        public void validate() {
            java.util.Objects.requireNonNull(group, "StepMatchArgument.group cannot be null");
            group.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StepMatchArgument that = (StepMatchArgument) o;
            return 
                group.equals(that.group) &&             
                java.util.Objects.equals(parameterTypeName, that.parameterTypeName);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                group,
                parameterTypeName
            );
        }

        @Override
        public String toString() {
            return "StepMatchArgument{" +
                "group=" + group +
                ", parameterTypeName=" + parameterTypeName +
                '}';
        }
    }


    public static class StepMatchArgumentsList {
        private java.util.List<StepMatchArgument> stepMatchArguments = new java.util.ArrayList<>();

        public StepMatchArgumentsList() {}

        public StepMatchArgumentsList(
            java.util.List<StepMatchArgument> stepMatchArguments
        ) {
            this.stepMatchArguments = java.util.Objects.requireNonNull(stepMatchArguments, "StepMatchArgumentsList.stepMatchArguments cannot be null");
        }

        public java.util.List<StepMatchArgument> getStepMatchArguments() {
            return java.util.Objects.requireNonNull(stepMatchArguments, "StepMatchArgumentsList.stepMatchArguments cannot be null");
        }

        public void setStepMatchArguments(java.util.List<StepMatchArgument> stepMatchArguments) {
            this.stepMatchArguments = java.util.Objects.requireNonNull(stepMatchArguments, "StepMatchArgumentsList.stepMatchArguments cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(stepMatchArguments, "StepMatchArgumentsList.stepMatchArguments cannot be null");
            stepMatchArguments.forEach(StepMatchArgument::validate);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StepMatchArgumentsList that = (StepMatchArgumentsList) o;
            return 
                stepMatchArguments.equals(that.stepMatchArguments);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                stepMatchArguments
            );
        }

        @Override
        public String toString() {
            return "StepMatchArgumentsList{" +
                "stepMatchArguments=" + stepMatchArguments +
                '}';
        }
    }


    public static class TestStep {
        private String hookId;
        private String id;
        private String pickleStepId;
        private java.util.List<String> stepDefinitionIds = new java.util.ArrayList<>();
        private java.util.List<StepMatchArgumentsList> stepMatchArgumentsLists = new java.util.ArrayList<>();

        public TestStep() {}

        public TestStep(
            String hookId,
            String id,
            String pickleStepId,
            java.util.List<String> stepDefinitionIds,
            java.util.List<StepMatchArgumentsList> stepMatchArgumentsLists
        ) {
            this.hookId = hookId;
            this.id = java.util.Objects.requireNonNull(id, "TestStep.id cannot be null");
            this.pickleStepId = pickleStepId;
            this.stepDefinitionIds = stepDefinitionIds;
            this.stepMatchArgumentsLists = stepMatchArgumentsLists;
        }

        public java.util.Optional<String> getHookId() {
            return java.util.Optional.ofNullable(hookId);
        }

        public void setHookId(String hookId) {
            this.hookId = hookId;
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "TestStep.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "TestStep.id cannot be null");
        }

        public java.util.Optional<String> getPickleStepId() {
            return java.util.Optional.ofNullable(pickleStepId);
        }

        public void setPickleStepId(String pickleStepId) {
            this.pickleStepId = pickleStepId;
        }

        public java.util.Optional<java.util.List<String>> getStepDefinitionIds() {
            return java.util.Optional.ofNullable(stepDefinitionIds);
        }

        public void setStepDefinitionIds(java.util.List<String> stepDefinitionIds) {
            this.stepDefinitionIds = stepDefinitionIds;
        }

        public java.util.Optional<java.util.List<StepMatchArgumentsList>> getStepMatchArgumentsLists() {
            return java.util.Optional.ofNullable(stepMatchArgumentsLists);
        }

        public void setStepMatchArgumentsLists(java.util.List<StepMatchArgumentsList> stepMatchArgumentsLists) {
            this.stepMatchArgumentsLists = stepMatchArgumentsLists;
        }

        public void validate() {
            java.util.Objects.requireNonNull(id, "TestStep.id cannot be null");
            if (stepDefinitionIds != null) stepDefinitionIds.forEach(e -> java.util.Objects.requireNonNull(e, "TestStep.stepDefinitionIds elements cannot be null"));
            if (stepMatchArgumentsLists != null) stepMatchArgumentsLists.forEach(StepMatchArgumentsList::validate);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestStep that = (TestStep) o;
            return 
                java.util.Objects.equals(hookId, that.hookId) &&             
                id.equals(that.id) &&             
                java.util.Objects.equals(pickleStepId, that.pickleStepId) &&             
                java.util.Objects.equals(stepDefinitionIds, that.stepDefinitionIds) &&             
                java.util.Objects.equals(stepMatchArgumentsLists, that.stepMatchArgumentsLists);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                hookId,
                id,
                pickleStepId,
                stepDefinitionIds,
                stepMatchArgumentsLists
            );
        }

        @Override
        public String toString() {
            return "TestStep{" +
                "hookId=" + hookId +
                ", id=" + id +
                ", pickleStepId=" + pickleStepId +
                ", stepDefinitionIds=" + stepDefinitionIds +
                ", stepMatchArgumentsLists=" + stepMatchArgumentsLists +
                '}';
        }
    }


    public static class TestCaseFinished {
        private String testCaseStartedId;
        private Timestamp timestamp;
        private Boolean willBeRetried;

        public TestCaseFinished() {}

        public TestCaseFinished(
            String testCaseStartedId,
            Timestamp timestamp,
            Boolean willBeRetried
        ) {
            this.testCaseStartedId = java.util.Objects.requireNonNull(testCaseStartedId, "TestCaseFinished.testCaseStartedId cannot be null");
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestCaseFinished.timestamp cannot be null");
            this.willBeRetried = java.util.Objects.requireNonNull(willBeRetried, "TestCaseFinished.willBeRetried cannot be null");
        }

        public String getTestCaseStartedId() {
            return java.util.Objects.requireNonNull(testCaseStartedId, "TestCaseFinished.testCaseStartedId cannot be null");
        }

        public void setTestCaseStartedId(String testCaseStartedId) {
            this.testCaseStartedId = java.util.Objects.requireNonNull(testCaseStartedId, "TestCaseFinished.testCaseStartedId cannot be null");
        }

        public Timestamp getTimestamp() {
            return java.util.Objects.requireNonNull(timestamp, "TestCaseFinished.timestamp cannot be null");
        }

        public void setTimestamp(Timestamp timestamp) {
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestCaseFinished.timestamp cannot be null");
        }

        public Boolean getWillBeRetried() {
            return java.util.Objects.requireNonNull(willBeRetried, "TestCaseFinished.willBeRetried cannot be null");
        }

        public void setWillBeRetried(Boolean willBeRetried) {
            this.willBeRetried = java.util.Objects.requireNonNull(willBeRetried, "TestCaseFinished.willBeRetried cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(testCaseStartedId, "TestCaseFinished.testCaseStartedId cannot be null");
            java.util.Objects.requireNonNull(timestamp, "TestCaseFinished.timestamp cannot be null");
            timestamp.validate();
            java.util.Objects.requireNonNull(willBeRetried, "TestCaseFinished.willBeRetried cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestCaseFinished that = (TestCaseFinished) o;
            return 
                testCaseStartedId.equals(that.testCaseStartedId) &&             
                timestamp.equals(that.timestamp) &&             
                willBeRetried.equals(that.willBeRetried);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                testCaseStartedId,
                timestamp,
                willBeRetried
            );
        }

        @Override
        public String toString() {
            return "TestCaseFinished{" +
                "testCaseStartedId=" + testCaseStartedId +
                ", timestamp=" + timestamp +
                ", willBeRetried=" + willBeRetried +
                '}';
        }
    }


    public static class TestCaseStarted {
        private Long attempt;
        private String id;
        private String testCaseId;
        private Timestamp timestamp;

        public TestCaseStarted() {}

        public TestCaseStarted(
            Long attempt,
            String id,
            String testCaseId,
            Timestamp timestamp
        ) {
            this.attempt = java.util.Objects.requireNonNull(attempt, "TestCaseStarted.attempt cannot be null");
            this.id = java.util.Objects.requireNonNull(id, "TestCaseStarted.id cannot be null");
            this.testCaseId = java.util.Objects.requireNonNull(testCaseId, "TestCaseStarted.testCaseId cannot be null");
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestCaseStarted.timestamp cannot be null");
        }

        public Long getAttempt() {
            return java.util.Objects.requireNonNull(attempt, "TestCaseStarted.attempt cannot be null");
        }

        public void setAttempt(Long attempt) {
            this.attempt = java.util.Objects.requireNonNull(attempt, "TestCaseStarted.attempt cannot be null");
        }

        public String getId() {
            return java.util.Objects.requireNonNull(id, "TestCaseStarted.id cannot be null");
        }

        public void setId(String id) {
            this.id = java.util.Objects.requireNonNull(id, "TestCaseStarted.id cannot be null");
        }

        public String getTestCaseId() {
            return java.util.Objects.requireNonNull(testCaseId, "TestCaseStarted.testCaseId cannot be null");
        }

        public void setTestCaseId(String testCaseId) {
            this.testCaseId = java.util.Objects.requireNonNull(testCaseId, "TestCaseStarted.testCaseId cannot be null");
        }

        public Timestamp getTimestamp() {
            return java.util.Objects.requireNonNull(timestamp, "TestCaseStarted.timestamp cannot be null");
        }

        public void setTimestamp(Timestamp timestamp) {
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestCaseStarted.timestamp cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(attempt, "TestCaseStarted.attempt cannot be null");
            java.util.Objects.requireNonNull(id, "TestCaseStarted.id cannot be null");
            java.util.Objects.requireNonNull(testCaseId, "TestCaseStarted.testCaseId cannot be null");
            java.util.Objects.requireNonNull(timestamp, "TestCaseStarted.timestamp cannot be null");
            timestamp.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestCaseStarted that = (TestCaseStarted) o;
            return 
                attempt.equals(that.attempt) &&             
                id.equals(that.id) &&             
                testCaseId.equals(that.testCaseId) &&             
                timestamp.equals(that.timestamp);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                attempt,
                id,
                testCaseId,
                timestamp
            );
        }

        @Override
        public String toString() {
            return "TestCaseStarted{" +
                "attempt=" + attempt +
                ", id=" + id +
                ", testCaseId=" + testCaseId +
                ", timestamp=" + timestamp +
                '}';
        }
    }


    public static class TestRunFinished {
        private String message;
        private Boolean success;
        private Timestamp timestamp;

        public TestRunFinished() {}

        public TestRunFinished(
            String message,
            Boolean success,
            Timestamp timestamp
        ) {
            this.message = message;
            this.success = java.util.Objects.requireNonNull(success, "TestRunFinished.success cannot be null");
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestRunFinished.timestamp cannot be null");
        }

        public java.util.Optional<String> getMessage() {
            return java.util.Optional.ofNullable(message);
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Boolean getSuccess() {
            return java.util.Objects.requireNonNull(success, "TestRunFinished.success cannot be null");
        }

        public void setSuccess(Boolean success) {
            this.success = java.util.Objects.requireNonNull(success, "TestRunFinished.success cannot be null");
        }

        public Timestamp getTimestamp() {
            return java.util.Objects.requireNonNull(timestamp, "TestRunFinished.timestamp cannot be null");
        }

        public void setTimestamp(Timestamp timestamp) {
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestRunFinished.timestamp cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(success, "TestRunFinished.success cannot be null");
            java.util.Objects.requireNonNull(timestamp, "TestRunFinished.timestamp cannot be null");
            timestamp.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestRunFinished that = (TestRunFinished) o;
            return 
                java.util.Objects.equals(message, that.message) &&             
                success.equals(that.success) &&             
                timestamp.equals(that.timestamp);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                message,
                success,
                timestamp
            );
        }

        @Override
        public String toString() {
            return "TestRunFinished{" +
                "message=" + message +
                ", success=" + success +
                ", timestamp=" + timestamp +
                '}';
        }
    }


    public static class TestRunStarted {
        private Timestamp timestamp;

        public TestRunStarted() {}

        public TestRunStarted(
            Timestamp timestamp
        ) {
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestRunStarted.timestamp cannot be null");
        }

        public Timestamp getTimestamp() {
            return java.util.Objects.requireNonNull(timestamp, "TestRunStarted.timestamp cannot be null");
        }

        public void setTimestamp(Timestamp timestamp) {
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestRunStarted.timestamp cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(timestamp, "TestRunStarted.timestamp cannot be null");
            timestamp.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestRunStarted that = (TestRunStarted) o;
            return 
                timestamp.equals(that.timestamp);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                timestamp
            );
        }

        @Override
        public String toString() {
            return "TestRunStarted{" +
                "timestamp=" + timestamp +
                '}';
        }
    }


    public static class TestStepFinished {
        private String testCaseStartedId;
        private String testStepId;
        private TestStepResult testStepResult;
        private Timestamp timestamp;

        public TestStepFinished() {}

        public TestStepFinished(
            String testCaseStartedId,
            String testStepId,
            TestStepResult testStepResult,
            Timestamp timestamp
        ) {
            this.testCaseStartedId = java.util.Objects.requireNonNull(testCaseStartedId, "TestStepFinished.testCaseStartedId cannot be null");
            this.testStepId = java.util.Objects.requireNonNull(testStepId, "TestStepFinished.testStepId cannot be null");
            this.testStepResult = java.util.Objects.requireNonNull(testStepResult, "TestStepFinished.testStepResult cannot be null");
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestStepFinished.timestamp cannot be null");
        }

        public String getTestCaseStartedId() {
            return java.util.Objects.requireNonNull(testCaseStartedId, "TestStepFinished.testCaseStartedId cannot be null");
        }

        public void setTestCaseStartedId(String testCaseStartedId) {
            this.testCaseStartedId = java.util.Objects.requireNonNull(testCaseStartedId, "TestStepFinished.testCaseStartedId cannot be null");
        }

        public String getTestStepId() {
            return java.util.Objects.requireNonNull(testStepId, "TestStepFinished.testStepId cannot be null");
        }

        public void setTestStepId(String testStepId) {
            this.testStepId = java.util.Objects.requireNonNull(testStepId, "TestStepFinished.testStepId cannot be null");
        }

        public TestStepResult getTestStepResult() {
            return java.util.Objects.requireNonNull(testStepResult, "TestStepFinished.testStepResult cannot be null");
        }

        public void setTestStepResult(TestStepResult testStepResult) {
            this.testStepResult = java.util.Objects.requireNonNull(testStepResult, "TestStepFinished.testStepResult cannot be null");
        }

        public Timestamp getTimestamp() {
            return java.util.Objects.requireNonNull(timestamp, "TestStepFinished.timestamp cannot be null");
        }

        public void setTimestamp(Timestamp timestamp) {
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestStepFinished.timestamp cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(testCaseStartedId, "TestStepFinished.testCaseStartedId cannot be null");
            java.util.Objects.requireNonNull(testStepId, "TestStepFinished.testStepId cannot be null");
            java.util.Objects.requireNonNull(testStepResult, "TestStepFinished.testStepResult cannot be null");
            testStepResult.validate();
            java.util.Objects.requireNonNull(timestamp, "TestStepFinished.timestamp cannot be null");
            timestamp.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestStepFinished that = (TestStepFinished) o;
            return 
                testCaseStartedId.equals(that.testCaseStartedId) &&             
                testStepId.equals(that.testStepId) &&             
                testStepResult.equals(that.testStepResult) &&             
                timestamp.equals(that.timestamp);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                testCaseStartedId,
                testStepId,
                testStepResult,
                timestamp
            );
        }

        @Override
        public String toString() {
            return "TestStepFinished{" +
                "testCaseStartedId=" + testCaseStartedId +
                ", testStepId=" + testStepId +
                ", testStepResult=" + testStepResult +
                ", timestamp=" + timestamp +
                '}';
        }
    }


    public static class TestStepResult {
        private Duration duration;
        private String message;
        private TestStepResultStatus status;

        public TestStepResult() {}

        public TestStepResult(
            Duration duration,
            String message,
            TestStepResultStatus status
        ) {
            this.duration = java.util.Objects.requireNonNull(duration, "TestStepResult.duration cannot be null");
            this.message = message;
            this.status = java.util.Objects.requireNonNull(status, "TestStepResult.status cannot be null");
        }

        public Duration getDuration() {
            return java.util.Objects.requireNonNull(duration, "TestStepResult.duration cannot be null");
        }

        public void setDuration(Duration duration) {
            this.duration = java.util.Objects.requireNonNull(duration, "TestStepResult.duration cannot be null");
        }

        public java.util.Optional<String> getMessage() {
            return java.util.Optional.ofNullable(message);
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public TestStepResultStatus getStatus() {
            return java.util.Objects.requireNonNull(status, "TestStepResult.status cannot be null");
        }

        public void setStatus(TestStepResultStatus status) {
            this.status = java.util.Objects.requireNonNull(status, "TestStepResult.status cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(duration, "TestStepResult.duration cannot be null");
            duration.validate();
            java.util.Objects.requireNonNull(status, "TestStepResult.status cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestStepResult that = (TestStepResult) o;
            return 
                duration.equals(that.duration) &&             
                java.util.Objects.equals(message, that.message) &&             
                status.equals(that.status);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                duration,
                message,
                status
            );
        }

        @Override
        public String toString() {
            return "TestStepResult{" +
                "duration=" + duration +
                ", message=" + message +
                ", status=" + status +
                '}';
        }
    }


    public static class TestStepStarted {
        private String testCaseStartedId;
        private String testStepId;
        private Timestamp timestamp;

        public TestStepStarted() {}

        public TestStepStarted(
            String testCaseStartedId,
            String testStepId,
            Timestamp timestamp
        ) {
            this.testCaseStartedId = java.util.Objects.requireNonNull(testCaseStartedId, "TestStepStarted.testCaseStartedId cannot be null");
            this.testStepId = java.util.Objects.requireNonNull(testStepId, "TestStepStarted.testStepId cannot be null");
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestStepStarted.timestamp cannot be null");
        }

        public String getTestCaseStartedId() {
            return java.util.Objects.requireNonNull(testCaseStartedId, "TestStepStarted.testCaseStartedId cannot be null");
        }

        public void setTestCaseStartedId(String testCaseStartedId) {
            this.testCaseStartedId = java.util.Objects.requireNonNull(testCaseStartedId, "TestStepStarted.testCaseStartedId cannot be null");
        }

        public String getTestStepId() {
            return java.util.Objects.requireNonNull(testStepId, "TestStepStarted.testStepId cannot be null");
        }

        public void setTestStepId(String testStepId) {
            this.testStepId = java.util.Objects.requireNonNull(testStepId, "TestStepStarted.testStepId cannot be null");
        }

        public Timestamp getTimestamp() {
            return java.util.Objects.requireNonNull(timestamp, "TestStepStarted.timestamp cannot be null");
        }

        public void setTimestamp(Timestamp timestamp) {
            this.timestamp = java.util.Objects.requireNonNull(timestamp, "TestStepStarted.timestamp cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(testCaseStartedId, "TestStepStarted.testCaseStartedId cannot be null");
            java.util.Objects.requireNonNull(testStepId, "TestStepStarted.testStepId cannot be null");
            java.util.Objects.requireNonNull(timestamp, "TestStepStarted.timestamp cannot be null");
            timestamp.validate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestStepStarted that = (TestStepStarted) o;
            return 
                testCaseStartedId.equals(that.testCaseStartedId) &&             
                testStepId.equals(that.testStepId) &&             
                timestamp.equals(that.timestamp);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                testCaseStartedId,
                testStepId,
                timestamp
            );
        }

        @Override
        public String toString() {
            return "TestStepStarted{" +
                "testCaseStartedId=" + testCaseStartedId +
                ", testStepId=" + testStepId +
                ", timestamp=" + timestamp +
                '}';
        }
    }


    public static class Timestamp {
        private Long seconds;
        private Long nanos;

        public Timestamp() {}

        public Timestamp(
            Long seconds,
            Long nanos
        ) {
            this.seconds = java.util.Objects.requireNonNull(seconds, "Timestamp.seconds cannot be null");
            this.nanos = java.util.Objects.requireNonNull(nanos, "Timestamp.nanos cannot be null");
        }

        public Long getSeconds() {
            return java.util.Objects.requireNonNull(seconds, "Timestamp.seconds cannot be null");
        }

        public void setSeconds(Long seconds) {
            this.seconds = java.util.Objects.requireNonNull(seconds, "Timestamp.seconds cannot be null");
        }

        public Long getNanos() {
            return java.util.Objects.requireNonNull(nanos, "Timestamp.nanos cannot be null");
        }

        public void setNanos(Long nanos) {
            this.nanos = java.util.Objects.requireNonNull(nanos, "Timestamp.nanos cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(seconds, "Timestamp.seconds cannot be null");
            java.util.Objects.requireNonNull(nanos, "Timestamp.nanos cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Timestamp that = (Timestamp) o;
            return 
                seconds.equals(that.seconds) &&             
                nanos.equals(that.nanos);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                seconds,
                nanos
            );
        }

        @Override
        public String toString() {
            return "Timestamp{" +
                "seconds=" + seconds +
                ", nanos=" + nanos +
                '}';
        }
    }


    public static class UndefinedParameterType {
        private String expression;
        private String name;

        public UndefinedParameterType() {}

        public UndefinedParameterType(
            String expression,
            String name
        ) {
            this.expression = java.util.Objects.requireNonNull(expression, "UndefinedParameterType.expression cannot be null");
            this.name = java.util.Objects.requireNonNull(name, "UndefinedParameterType.name cannot be null");
        }

        public String getExpression() {
            return java.util.Objects.requireNonNull(expression, "UndefinedParameterType.expression cannot be null");
        }

        public void setExpression(String expression) {
            this.expression = java.util.Objects.requireNonNull(expression, "UndefinedParameterType.expression cannot be null");
        }

        public String getName() {
            return java.util.Objects.requireNonNull(name, "UndefinedParameterType.name cannot be null");
        }

        public void setName(String name) {
            this.name = java.util.Objects.requireNonNull(name, "UndefinedParameterType.name cannot be null");
        }

        public void validate() {
            java.util.Objects.requireNonNull(expression, "UndefinedParameterType.expression cannot be null");
            java.util.Objects.requireNonNull(name, "UndefinedParameterType.name cannot be null");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UndefinedParameterType that = (UndefinedParameterType) o;
            return 
                expression.equals(that.expression) &&             
                name.equals(that.name);            
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                expression,
                name
            );
        }

        @Override
        public String toString() {
            return "UndefinedParameterType{" +
                "expression=" + expression +
                ", name=" + name +
                '}';
        }
    }

    public enum AttachmentContentEncoding {
        IDENTITY("IDENTITY"),
        BASE64("BASE64");
    
        private final String value;
        private final static java.util.Map<String, AttachmentContentEncoding> CONSTANTS = new java.util.HashMap<>();

        static {
            for (AttachmentContentEncoding c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AttachmentContentEncoding(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static AttachmentContentEncoding fromValue(String value) {
            AttachmentContentEncoding constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
    }

    public enum SourceMediaType {
        TEXT_X_CUCUMBER_GHERKIN_PLAIN("text/x.cucumber.gherkin+plain"),
        TEXT_X_CUCUMBER_GHERKIN_MARKDOWN("text/x.cucumber.gherkin+markdown");
    
        private final String value;
        private final static java.util.Map<String, SourceMediaType> CONSTANTS = new java.util.HashMap<>();

        static {
            for (SourceMediaType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SourceMediaType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SourceMediaType fromValue(String value) {
            SourceMediaType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
    }

    public enum StepDefinitionPatternType {
        CUCUMBER_EXPRESSION("CUCUMBER_EXPRESSION"),
        REGULAR_EXPRESSION("REGULAR_EXPRESSION");
    
        private final String value;
        private final static java.util.Map<String, StepDefinitionPatternType> CONSTANTS = new java.util.HashMap<>();

        static {
            for (StepDefinitionPatternType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        StepDefinitionPatternType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static StepDefinitionPatternType fromValue(String value) {
            StepDefinitionPatternType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
    }

    public enum TestStepResultStatus {
        UNKNOWN("UNKNOWN"),
        PASSED("PASSED"),
        SKIPPED("SKIPPED"),
        PENDING("PENDING"),
        UNDEFINED("UNDEFINED"),
        AMBIGUOUS("AMBIGUOUS"),
        FAILED("FAILED");
    
        private final String value;
        private final static java.util.Map<String, TestStepResultStatus> CONSTANTS = new java.util.HashMap<>();

        static {
            for (TestStepResultStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TestStepResultStatus(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static TestStepResultStatus fromValue(String value) {
            TestStepResultStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
    }

}
