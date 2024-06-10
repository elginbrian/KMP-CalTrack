package features.domain

interface FirestoreTest {
    suspend fun createNewDocument(data: Map<String, Any>): String
}