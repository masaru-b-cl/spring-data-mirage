/*
 * Copyright 2011-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.xet.springframework.data.mirage.repository.chunk;

import java.util.List;

import org.springframework.data.repository.query.Param;

import org.ws2ten1.chunks.Chunk;
import org.ws2ten1.repositories.ChunkableRepository;
import org.ws2ten1.repositories.CreatableRepository;
import org.ws2ten1.repositories.PageableRepository;
import org.ws2ten1.repositories.ScannableRepository;
import org.ws2ten1.repositories.UpsertableRepository;
import org.ws2ten1.repositories.WritableRepository;

import jp.xet.springframework.data.mirage.repository.query.StaticParam;

/**
 * Repository interface for {@link ChunkEntity}.
 *
 * @author daisuke
 */
public interface ChunkEntityRepository
		extends CreatableRepository<ChunkEntity, Long>, ChunkableRepository<ChunkEntity, Long> {
}
